package com.goonline.customer.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GoOnlineCustomerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoOnlineCustomerManagementApplication.class, args);
	}

}
