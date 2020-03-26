package cc.mrbird.febs.server.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableDiscoveryClient
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class FebsServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FebsServerTestApplication.class, args);
	}

}
