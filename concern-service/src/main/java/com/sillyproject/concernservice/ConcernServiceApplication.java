package com.sillyproject.concernservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class ConcernServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcernServiceApplication.class, args);
	}
	
	@Bean
	WebClient getWebClient() {
		return WebClient.builder().build();
	}

}
