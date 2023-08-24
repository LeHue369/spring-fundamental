package com.example.spring.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
	public List<String> getSuperUsers(){
		final List<String> superUsers = new ArrayList<>();
		superUsers.add("Mike");
		superUsers.add("Jasper");
		superUsers.add("Lindsay");

		return superUsers;
	}
}
