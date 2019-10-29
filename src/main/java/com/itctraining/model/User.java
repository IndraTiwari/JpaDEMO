package com.itctraining.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
	private UUID userID;
	private String userName;
	private String location;
	
	public User(){
	}
	
	public User(UUID userID, String userName, String location) {
		this.userID = userID;
		this.userName = userName;
		this.location = location;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", location=" + location + "]";
	}
}
