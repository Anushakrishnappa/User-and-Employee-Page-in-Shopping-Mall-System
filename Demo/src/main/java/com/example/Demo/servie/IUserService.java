package com.example.Demo.servie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.entities.*;


public interface IUserService {

	User addUser(User user);
//	public User addUser(User user);
//	public User updateUser(User user);
//	public User login(User user);
//	public boolean logOut();

	User updateUser(User user);

	User searchUser(long id);

	User deleteUser(long id);

//	List<User> findAll();

	List<User> findAllUsers();
	
	
}
