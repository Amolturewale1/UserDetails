package com.jsp.UserAPI.servies;

import java.util.List;

import com.jsp.UserAPI.entity.User;

public interface UserServies {
	
	User addUser(User user);
	
	List<User> getAllUser();
	
	User getUser(int id);
	

}
