package com.itctraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itctraining.model.User;
import com.itctraining.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	 @Autowired
	    private UserService userService;

	    @GetMapping("/users")
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }
	 
	    @GetMapping("/users/{userName}")
	    public List<User> getUserByUserName(@PathVariable("userName") String userName) {
	        return userService.getUserByUserName(userName);
	    }

	    @PostMapping("/users")
	    public User saveUser(@RequestBody User userData) {
	        User savedUser = userService.saveUser(userData);
	        return savedUser;
	    }
	}