package com.jsp.UserAPI.myController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.UserAPI.entity.User;
import com.jsp.UserAPI.servies.UserServies;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@Autowired
	UserServies userServies;
	
	@PostMapping("/user/register")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		
	 	  userServies.addUser(user);
	 	  return ResponseEntity.ok("Successfull");
	}
	
	@GetMapping("/user/fetch")
	public List<User> getAllUser(){
		return userServies.getAllUser();
	}
	

}
