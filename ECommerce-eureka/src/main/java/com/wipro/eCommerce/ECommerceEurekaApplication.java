package com.wipro.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ECommerceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceEurekaApplication.class, args);
	}

}
