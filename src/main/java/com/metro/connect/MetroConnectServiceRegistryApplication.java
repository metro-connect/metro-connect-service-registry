package com.metro.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class MetroConnectServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetroConnectServiceRegistryApplication.class, args);
	}

}
