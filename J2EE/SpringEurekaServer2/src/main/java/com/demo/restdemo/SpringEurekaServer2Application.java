package com.demo.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class SpringEurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServer2Application.class, args);
	}

}
