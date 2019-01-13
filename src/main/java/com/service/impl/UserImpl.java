package com.service.impl;

import org.springframework.stereotype.Service;

import com.service.UserService;

@Service
public class UserImpl implements UserService {
	
	public void save(){
		System.err.println(this.getClass()+", save ...");
	}
	
	public void update(){
		System.err.println(this.getClass()+", update ...");
	}

	public void save(String name){
		System.err.println(this.getClass()+", save ... "+name);
	}
	
	public String update(String name){
		System.err.println(this.getClass()+", update ... "+name);
		return name;
	}

	public UserImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
