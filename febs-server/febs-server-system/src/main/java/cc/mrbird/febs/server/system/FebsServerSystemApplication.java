package cc.mrbird.febs.server.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class FebsServerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FebsServerSystemApplication.class, args);
	}

}
