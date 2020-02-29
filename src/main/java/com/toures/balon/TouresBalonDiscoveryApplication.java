package com.toures.balon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TouresBalonDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouresBalonDiscoveryApplication.class, args);
	}

}
