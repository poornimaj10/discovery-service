package com.application.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServericeApplication{

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServericeApplication.class, args);
	}

}