package com.login.login.services;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.login.login.model.Users;
import com.login.login.repository.UsersRepository;
//import com.vikash.modal.User;

//import antlr.collections.List;

@Service
@Transactional
public class Myservices {
	private final  UsersRepository userRepository ;
public Myservices(UsersRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
public void saveMydata(Users user) 
	{
	//UsersRepository 
	userRepository.save(user);
	}
public List<Users> showAllusers()
	{
	List<Users> users = new ArrayList<Users>() ;
	for(Users user : userRepository.findAll()) 
		{
		users.add(user);
		}
	return users ;
	
	}

public void validate_abs(int id) 
	{
	for(Users user : userRepository.findAll() ) 
	{
		if(user.getId() == id) 
		{
			
			user.setNbr_heures(1);
		}
	}
	
	}
/*public Optional<Users> editUser(int id) {
	return userRepository.findById(id);
}*/
}
