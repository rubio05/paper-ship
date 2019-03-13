package com.demo.demo;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int counter = 3;
	
	static {
		users.add(new User(1, "Rene", new Date()));
		users.add(new User(2, "Pepe", new Date()));
		users.add(new User(3, "Cuco", new Date()));
	}
	
	
	public List<User> FindAll (){
		return users;
	}
	
	public User Save(User user) {
		user.setId(++counter);
		users.add(user);
		return user;
	}
	
	public User FindOne(int id) {
		
		for (User u:users) {
			if (u.getId()==id) {
				return u;
			}
		}
		return null;
	}
	
	
	public User Delete(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
			
		}
		return null;
	}
}
