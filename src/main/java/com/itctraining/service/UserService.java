package com.itctraining.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itctraining.model.User;
import com.itctraining.respository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public List<User> getUserByUserName(String userName){
		return userRepository.findByUserName(userName);
	}
	
	public User saveUser(User userToBeSaved) {
		UUID uuid = UUID.randomUUID();
		userToBeSaved.setUserID(uuid);
		return userRepository.save(userToBeSaved);
	}
}
