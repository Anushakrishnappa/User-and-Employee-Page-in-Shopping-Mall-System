package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entities.User;
import com.example.Demo.repository.IUserRepository;
import com.example.Demo.servie.IUserService;

@RestController
@RequestMapping("/user")
@Component
public class UserController {
	
	
	@Autowired
	private IUserService userService;
	
	 @PostMapping("/addUser")
	    public User createUser(@Validated @RequestBody User user) {
		  
	        return userService.addUser(user);
	    }
	  
	  @PostMapping("/updateUser")
	    public User UpdateUser(@Validated @RequestBody User user) {
		  
	        return userService.updateUser(user);
	    }
	  
	  @PostMapping("/searchUser")
	    public User searchUser(@Validated @RequestBody User user) {
		  
	        return userService.searchUser(user.getId());
	    }
	  
	  @PostMapping("/deleteUser")
	    public User deleteUser(@Validated @RequestBody User user) {
		  
	        return userService.deleteUser(user.getId());
	    }

	
	  @GetMapping("/getAllUsers")
	    public List<User> getAllUsers() {
	        return userService.findAllUsers();
	    }
//	  @PostMapping("/login")
//	  public User loginUser(@Validated @RequestBody User user) {
//	        return iUserService.login(user);
//	    }
	
	
	
}