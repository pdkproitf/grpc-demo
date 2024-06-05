package spring_boot.grpc.config;

import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

	@Bean
	@GrpcGlobalServerInterceptor
	public ServerInterceptor loggingInterceptor() {
		return new LoggingInterceptor();
	}
}
