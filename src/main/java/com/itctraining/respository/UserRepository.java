package com.itctraining.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itctraining.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	public List<User> findByUserName(String userName);
}
