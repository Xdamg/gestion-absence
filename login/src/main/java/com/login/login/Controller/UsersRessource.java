package com.login.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.login.login.model.*;
import com.login.login.repository.*;
import com.login.login.services.Myservices;

import java.util.* ;
@RestController
@RequestMapping("/users")
public class UsersRessource {
@Autowired
UsersRepository usersRepository ;
@GetMapping(value="/all")
public List<Users> getAll()
	{
	
	return  usersRepository.findAll();
 	}
@Autowired
private Myservices userService ;
@GetMapping(value="/save")
public String saveUser(@RequestParam String name  ,@RequestParam int nbr_heures,@RequestParam String password) 
	{
	Users user = new Users(name ,nbr_heures,password);
	{
	userService.saveMydata(user);
	
	}
	return "bien engistré";
	}
	
	
}


