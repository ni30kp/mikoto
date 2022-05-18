package com.wecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WecareEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WecareEurekaApplication.class, args);
	}

}
