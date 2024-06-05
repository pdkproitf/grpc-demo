package spring_boot.grpc_client;

import net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GrpcClientAutoConfiguration.class)
public class GrpcClientApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(GrpcClientApplication.class, args);
		System.out.println("GrpcClientApplication started successfully.");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("GrpcClientApplication running.");
		GrpcClientService grpcClientService = appContext.getBean(GrpcClientService.class);
		grpcClientService.sendMessage("Uzumaki Naruto");

		System.out.println();
		grpcClientService.sendOnceAndReceiveManyTimes("Kakashi Hatake");

		System.out.println();
		grpcClientService.sendManyAndReceiveOnce("Sasuke Uchiha", "Uchiha Itachi", "Hinata Hyuga", "Uchiha Shisui", "Sakura Haruno");

		System.out.println();
		grpcClientService.sendManyAndReceiveMany("Pain", "Konan", "Obito Uchiha", "Madara Uchiha", "Kaguya Otsutsuki");
	}
}
