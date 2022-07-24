package com.javatechie.jwt.api.entity;


import org.springframework.stereotype.Component;


public class ExceptionMsg {
	
	String errcode;
	String msg;
	String token;
	
	public ExceptionMsg() {
		// TODO Auto-generated constructor stub
	}
	
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public ExceptionMsg(String errcode, String msg, String token) {
		super();
		this.errcode = errcode;
		this.msg = msg;
		this.token = token;
	}

	
	
	
}
