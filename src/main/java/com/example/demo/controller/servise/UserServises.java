package com.example.demo.controller.servise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.Model.User;

@Service
public class UserServises {

	
	Map<Long , User> userMap = new HashMap<>();
	
	Long id = 1l;
	public User addUser(User user) {
		
		 userMap.put(id++,user);
		 return user;
	}
	public User deleteaddUser(Long userId) {
		return userMap.remove(userId);
	
	}
	public List<User> getUser() {
		List <User> user = new ArrayList<User>();
		return (List<User>) userMap;
			
		}
	}
	
	


