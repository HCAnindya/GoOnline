package com.go.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoOnlineDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoOnlineDiscoveryServiceApplication.class, args);
	}

}
	