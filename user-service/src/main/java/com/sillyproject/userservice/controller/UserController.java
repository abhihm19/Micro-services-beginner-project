package com.sillyproject.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@GetMapping("/user")
	public String getMessage() {
		System.out.println("user service called");
		return "This is User service";
	}
}
