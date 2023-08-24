package com.example.spring.controller;

import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/super-users")
	public String getAllSuperuse(){
		return "All supers are: " + userService.getSuperUsers();
	}
}
