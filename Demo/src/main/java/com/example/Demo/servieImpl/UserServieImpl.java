package com.example.Demo.servieImpl;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entities.User;
import com.example.Demo.repository.IUserRepository;
import com.example.Demo.servie.IUserService;

@Service
@Transactional
public class UserServieImpl implements IUserService {
	
	@Autowired
	  private IUserRepository iUserRepository;
	
	
	
	
	

//	@Override
//	public List<User> getUsersByUser() {
//		// TODO Auto-generated method stub
//		return iUserRepository.findAll() ;
//	}
//
//	@Override
//	public void deleteUser(long id) {
//		iUserRepository.deleteById(id);
//		
//	}
//
//	@Override
//	public User getUserById(long id) {
//		// TODO Auto-generated method stub
//		
//		User usr = iUserRepository.findById(id).get();
//		return usr;
//	
//	}
//
//	@Override
//	public void updateUser(User user) {
//		// TODO Auto-generated method stub
//		
//		iUserRepository.save(user);
//	}

	@Override
	public User addUser(User user) {
		
		return iUserRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		
	return iUserRepository.save(user);
	}

	@Override
	public User searchUser(long id) {
		// TODO Auto-generated method stub
		User usr = iUserRepository.findById(id).get();
//		return usr;
		return usr;
	}

	@Override
	public User deleteUser(long id) {
		// TODO Auto-generated method stub
		User usr = iUserRepository.findById(id).get();
		iUserRepository.deleteById(id);
		
		return usr;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return iUserRepository.findAll() ;
	}

//	@Override
//	public User login(User user) {
//		
//		List<User> users = iUserRepository.findAll();
//		
//		User usr =new User();	
//        for(int i=0;i<users.size();i++)
//        {
//        	if(users.get(i).getName().equalsIgnoreCase(user.getName()) && users.get(i).getPassword().equalsIgnoreCase(user.getPassword()))
//        	{
//        		
//          		usr.setId(users.get(i).getId());
//                usr.setName(users.get(i).getName());
//                usr.setPassword(users.get(i).getPassword());
//                usr.setType(users.get(i).getType());
//        }
//       
//    }
//        return  usr;
//	}



}
