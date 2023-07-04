package com.sillyproject.concernservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/v1/concerns")
public class ConcernController {
	
	private WebClient webClient;

	@GetMapping("/concern")
	public String getMessage() {
		return "This is Concern service";
	}
	
	@GetMapping("/message")
	public String getMessageFromUserService() {
		
		String message = webClient.get()
		.uri("http://localhost:8082/api/v1/users/user")
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		return "Message recieved from user service" + message;
	}
}
