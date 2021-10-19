package com.cg.smms.service;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.smms.entities.User;
import com.cg.smms.repository.UserRepository;
import com.cg.smms.repository.UserRepositoryImpl;
import com.cg.smms.util.HibernateUtil;

//import net.demo.employeeManagement.model.User;
//import net.demo.employeeManagement.utill.HibernateUtil;

//import net.javaguides.usermanagement.model.User;
//import net.javaguides.usermanagement.utl.HibernateUtil;
public class UsrserviceImpl implements UserServie {

	/**
     * Save User
     * @param user
     */
	public UserRepository userRepo = new UserRepositoryImpl();
    public void saveUser(User user) {
    	
    	userRepo.saveUser(user);
       
    }

    /**
     * Update User
     * @param user
     */
    public void updateUser(User user) {
    	
    	userRepo.updateUser(user);
       
    }

    /**
     * Delete User
     * @param id
     */
    public void deleteUser(int id) {

    	userRepo.deleteUser(id);
    }

    /**
     * Get User By ID
     * @param id
     * @return
     */
    public User getUser(int id) {

    	User existingUser = userRepo.getUser(id);
    	
    	return existingUser;
    }

    /**
     * Get all Users
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < User > getAllUser() {

    	
    	List < User > listUser = userRepo.getAllUser();
    	
    	return listUser;
}
}


