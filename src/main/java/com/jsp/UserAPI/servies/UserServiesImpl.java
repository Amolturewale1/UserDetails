package com.jsp.UserAPI.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.UserAPI.dao.UserDao;
import com.jsp.UserAPI.entity.User;


@Service
public class UserServiesImpl implements UserServies{
	
	@Autowired
	UserDao userDao;
	
	

	@Override
	public User addUser(User user) {
	
		 return  userDao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userDao.findAll();
	}

	@Override
	public User getUser(int id) {
		Optional<User> optional =userDao.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
