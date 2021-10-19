package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.User;

public interface UserServie {
	
	User getUser(int id);

	List<User> getAllUser();

	void saveUser(User newUser);

	void updateUser(User user);

	void deleteUser(int id);

}
