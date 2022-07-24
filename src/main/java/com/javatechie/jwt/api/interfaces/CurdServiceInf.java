package com.javatechie.jwt.api.interfaces;

import java.util.List;

import com.javatechie.jwt.api.entity.User;

public interface CurdServiceInf {
	
	public User getUser(int id);
	public List<User> getAllUser();
	public  User saveUser(User user);
	public String deleteUser(int id);
	
}
