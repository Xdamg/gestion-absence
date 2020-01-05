package com.login.login.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.login.model.Users;
import com.login.login.services.Myservices;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.stereotype.RequestMapping;
//import com.vikash.services.UserService;


@Controller
public class MyController {
	@Autowired
	Myservices userService;
	@RequestMapping("/welcome")
	public String welcome() 
	{
	return "welcome";
	
	}
	@GetMapping("/noter-absence")
	public String showAllUsers(HttpServletRequest request) 
		{
		request.setAttribute("users",userService.showAllusers()) ;
		request.setAttribute("mode", "ALL_STUDENTS");
		return "welcome" ; 
		
		}
	@GetMapping("/modifier-absence")
	public String showStudents(HttpServletRequest request) 
		{
		request.setAttribute("users",userService.showAllusers()) ;
		request.setAttribute("mode", "ALL_USERS");
		return "welcome" ; 
		
		}
	@GetMapping("/validate-absence")
	public String validate(@RequestParam int id , HttpServletRequest request  ) 
			{
		userService.validate_abs(id);
		request.setAttribute("users",userService.showAllusers()) ;
		request.setAttribute("mode", "ALL_USERS");
		
		return "welcome" ;
			
			}
	
	@GetMapping("/modifier")
	public void editer() 
		{
		
		
		}
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam int id,HttpServletRequest request) {
	//	request.setAttribute("user", userService.editUser(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcome";
	}
	
}
	
	

