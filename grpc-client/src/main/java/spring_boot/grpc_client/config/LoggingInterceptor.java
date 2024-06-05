package spring_boot.grpc_client.config;
import io.grpc.*;

public class LoggingInterceptor implements ClientInterceptor {

	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
		MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {

		return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
			@Override
			public void sendMessage(ReqT message) {
				System.out.println("Send request message: " + message);
				super.sendMessage(message);
			}

			@Override
			public void start(Listener<RespT> responseListener, Metadata headers) {
				super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
					@Override
					public void onMessage(RespT message) {
						System.out.println("Receive response message: " + message);
						super.onMessage(message);
					}
				}, headers);
			}
		};
	}
}
