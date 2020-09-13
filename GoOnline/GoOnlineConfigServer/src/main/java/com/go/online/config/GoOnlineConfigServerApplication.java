package com.go.online.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GoOnlineConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoOnlineConfigServerApplication.class, args);
	}

}
