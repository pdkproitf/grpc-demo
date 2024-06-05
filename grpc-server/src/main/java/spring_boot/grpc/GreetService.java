package spring_boot.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.concurrent.TimeUnit;

@GrpcService
public class GreetService extends GreetServiceGrpc.GreetServiceImplBase {
	@Override
	public void sayHello(GreetRequest request, StreamObserver<GreetResponse> responseStreamObserver) {
		// Generate a greeting message for the original method
		String message = "Hello " + request.getName();
		GreetResponse response = GreetResponse.newBuilder().setMessage(message).build();

		// Send the reply back to the client.
		responseStreamObserver.onNext(response);

		// Indicate that no further messages will be sent to the client.
		responseStreamObserver.onCompleted();
	}

	@Override
	public void sayHelloManyTimes(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
		String message = "Hello " + request.getName();
		for (int i = 0; i < 5; i++) {
			GreetResponse response = GreetResponse.newBuilder().setMessage(message + " again " + i).build();
			responseObserver.onNext(response);
			sleep(1);
		}
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<GreetRequest> sayHelloAllAtOnce(StreamObserver<GreetResponse> responseObserver) {
		return new StreamObserver<GreetRequest>() {
			String result = "";

			@Override
			public void onNext(GreetRequest value) {
				result += "Hello " + value.getName() + "! ";
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error: " + t.getMessage());
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(GreetResponse.newBuilder().setMessage(result).build());
				responseObserver.onCompleted();
			}
		};
	}

	@Override
	public StreamObserver<GreetRequest> sayHelloOneByOne(StreamObserver<GreetResponse> responseObserver) {
		return new StreamObserver<GreetRequest>() {
			@Override
			public void onNext(GreetRequest value) {
				String message = "Hello " + value.getName();
				GreetResponse response = GreetResponse.newBuilder().setMessage(message).build();
				responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error: " + t.getMessage());
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}

	private void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
