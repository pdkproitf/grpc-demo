package spring_boot.grpc_client;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import spring_boot.grpc.GreetRequest;
import spring_boot.grpc.GreetResponse;
import spring_boot.grpc.GreetServiceGrpc;

@Service
public class GrpcClientService {
	@GrpcClient("greeting-grpc-server")
	public GreetServiceGrpc.GreetServiceBlockingStub greetServiceStub;

	@GrpcClient("greeting-grpc-server")
	public GreetServiceGrpc.GreetServiceStub greetServiceAsyncStub;

	public void sendMessage(String name) {
		System.out.println("************** sendMessage **************");
		System.out.println("[sendMessage] Sending message to server: " + name);
		GreetRequest greetRequest = GreetRequest.newBuilder().setName(name).build();
		GreetResponse greetResponse = this.greetServiceStub.sayHello(greetRequest);
		System.out.println("[sendMessage] Response from server: " + greetResponse.getMessage());
	}

	public void sendOnceAndReceiveManyTimes(String name) {
		System.out.println("************** sendOnceAndReceiveManyTimes **************");
		System.out.println("[sendOnceAndReceiveManyTimes] Sending message to server: " + name);
		GreetRequest greetRequest = GreetRequest.newBuilder().setName(name).build();
		this.greetServiceStub.sayHelloManyTimes(greetRequest).forEachRemaining(greetResponse -> {
			System.out.println("[sendOnceAndReceiveManyTimes] Response from server: " + greetResponse.getMessage());
		});
	}

	public void sendManyAndReceiveOnce(String... names) {
		System.out.println("************** sendManyAndReceiveOnce **************");
		StreamObserver<GreetRequest> requestObserver = this.greetServiceAsyncStub.sayHelloAllAtOnce(new StreamObserver<GreetResponse>() {
			@Override
			public void onNext(GreetResponse value) {
				System.out.println("[sendManyAndReceiveOnce] Response from server: " + value.getMessage());
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("[sendManyAndReceiveOnce] Error: " + t.getMessage());
			}

			@Override
			public void onCompleted() {
				System.out.println("[sendManyAndReceiveOnce] Server is done sending messages.");
			}
		});

		for (String name : names) {
			System.out.println("[sendManyAndReceiveOnce] Sending messages to server: " + name);
			requestObserver.onNext(GreetRequest.newBuilder().setName(name).build());
			sleep(1);
		}
		requestObserver.onCompleted();
	}

	public void sendManyAndReceiveMany(String... names) {
		System.out.println("************** sendManyAndReceiveMany **************");
		StreamObserver<GreetRequest> requestObserver = this.greetServiceAsyncStub.sayHelloOneByOne(new StreamObserver<GreetResponse>() {
			@Override
			public void onNext(GreetResponse value) {
				System.out.println("[sendManyAndReceiveMany] Response from server: " + value.getMessage());
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error: " + t.getMessage());
			}

			@Override
			public void onCompleted() {
				System.out.println("[sendManyAndReceiveMany] Server is done sending messages.");
			}
		});

		for (String name : names) {
			System.out.println("[sendManyAndReceiveMany] Sending messages to server: " + name);
			requestObserver.onNext(GreetRequest.newBuilder().setName(name).build());
			sleep(1);
		}
		requestObserver.onCompleted();
	}

	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
