package spring_boot.grpc.config;

import io.grpc.*;

public class LoggingInterceptor implements ServerInterceptor {

	@Override
	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
		ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {

		return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(next.startCall(
			new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {

				@Override
				public void sendMessage(RespT message) {
					System.out.println("Sending response: " + message);
					super.sendMessage(message);
				}

			}, headers)) {

			@Override
			public void onMessage(ReqT message) {
				System.out.println("Received message: " + message);
				super.onMessage(message);
			}

			@Override
			public void onHalfClose() {
				System.out.println("Half close received");
				super.onHalfClose();
			}

			@Override
			public void onComplete() {
				System.out.println("Call complete");
				super.onComplete();
			}

			@Override
			public void onCancel() {
				System.out.println("Call cancelled");
				super.onCancel();
			}
		};
	}
}
