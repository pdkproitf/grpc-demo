package spring_boot.grpc.config;

import io.grpc.*;

public class LoggingInterceptor implements ServerInterceptor {
	private static final String AUTH_TOKEN = "valid-token";

	@Override
	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
		ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {

		String methodName = call.getMethodDescriptor().getFullMethodName();
		String token = headers.get(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER));
		System.out.println("Received call for method: " + methodName);

		if (AUTH_TOKEN.equals(token)) {
			System.out.println("Authentication successful");
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
		} else {
			System.out.println("Authentication failed");
			call.close(Status.UNAUTHENTICATED.withDescription("Invalid auth token"), headers);
			return new ServerCall.Listener<ReqT>() {};
		}
	}
}
