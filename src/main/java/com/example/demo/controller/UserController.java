package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.controller.servise.UserServises;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	
	@Autowired
	private UserServises service;
	
	
	@GetMapping()
	public User addUser(@RequestBody User user) {
		return service.addUser( user );
	}
	

	@PostMapping()
	public List< User> getUser() {
		return service.getUser( );
	}
	

	@DeleteMapping("/id")
	public User addUser(@PathVariable("id")Long userId) {
		return service.deleteaddUser( userId );
	}
	
}
