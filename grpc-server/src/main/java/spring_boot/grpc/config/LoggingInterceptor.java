package spring_boot.grpc.config;

import io.grpc.*;

public class LoggingInterceptor implements ServerInterceptor {

	@Override
	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
		ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {

		return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(next.startCall(call, headers)) {

			@Override
			public void onMessage(ReqT message) {
				System.out.println("Receive Request message: " + message.toString());
				super.onMessage(message);
			}

			@Override
			public void onHalfClose() {
				super.onHalfClose();
			}

			@Override
			public void onCancel() {
				super.onCancel();
			}

			@Override
			public void onComplete() {
				super.onComplete();
			}

			@Override
			public void onReady() {
				super.onReady();
			}
		};
	}
}
