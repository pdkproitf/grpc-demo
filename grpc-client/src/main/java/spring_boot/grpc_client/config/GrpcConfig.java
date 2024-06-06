package spring_boot.grpc_client.config;

import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

	@Bean
	@GrpcGlobalClientInterceptor
	public ClientInterceptor loggingInterceptor() {
		return new LoggingInterceptor();
	}
}
