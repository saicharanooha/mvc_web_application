package com.spring.mvc_project;

public class Profile extends Exception {
	
	String msg;
	public Profile(String s) {
		this.msg=s;
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
