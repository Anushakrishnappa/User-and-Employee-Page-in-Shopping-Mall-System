package com.cg.smms.repository;

import java.util.List;

import com.cg.smms.entities.User;

public interface UserRepository {

	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	List<User> getAllUser();

	User getUser(int id);

}
