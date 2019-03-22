package com.demo.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping(path="/")
	public String home () {
		return "Rene's first Rest API using Spring boot!!!!!!!";
	}
	
	
	@GetMapping(path="/hello")
	public String helloWorld () {
		return "Hello World!";
	}

	@GetMapping(path="/users")
	public List<User> getAllUsers (){

		return service.FindAll();

	}

}
