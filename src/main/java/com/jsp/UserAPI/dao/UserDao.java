package com.jsp.UserAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.UserAPI.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
