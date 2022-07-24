package com.javatechie.jwt.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.jwt.api.entity.User;
import com.javatechie.jwt.api.interfaces.CurdServiceInf;
import com.javatechie.jwt.api.repository.UserRepository;

@Service
public class UserCrudOp implements CurdServiceInf
{

	@Autowired
    private UserRepository repository;

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		Optional<User> user = repository.findById(id);
		return user.get();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
