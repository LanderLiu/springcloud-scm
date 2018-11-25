package com.lander.scm.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScmEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmEurekaserverApplication.class, args);
	}
}
