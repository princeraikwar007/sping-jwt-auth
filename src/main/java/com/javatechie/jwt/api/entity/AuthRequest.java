package com.javatechie.jwt.api.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
public class AuthRequest {

    private String userName;
    private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
    
    public AuthRequest() {
		// TODO Auto-generated constructor stub
	}
    
    
    
}
