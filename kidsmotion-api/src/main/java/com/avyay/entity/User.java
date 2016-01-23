package com.avyay.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	private long userId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	private String userName;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String password;

	private String profileName;

	private String lastName;

	private String firstName;

	public User() {

		System.out.println("CAlling default cons");
	}

	@PersistenceConstructor
	public User(long userId, String userName, String password, String profileName, String lastName, String firstName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.profileName = profileName;
		this.lastName = lastName;
		this.firstName = firstName;
	}

}
