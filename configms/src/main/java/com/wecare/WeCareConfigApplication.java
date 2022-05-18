package com.wecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WeCareConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeCareConfigApplication.class, args);
	}

}
