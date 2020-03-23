package cc.mrbird.febs.server.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class FebsServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FebsServerTestApplication.class, args);
	}

}
