package com.example.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entities.*;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{	 
//	public User addUser(User user);
//	public User updateUser(User user);
//	public User deleteUser(long id);

}
