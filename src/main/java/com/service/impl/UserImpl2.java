package com.service.impl;

import org.springframework.stereotype.Service;

import com.service.UserService;

@Service
public class UserImpl2 implements UserService {
	
	public void save(){
		System.err.println(this.getClass()+", save2 ...");
	}
	
	public void update(){
		System.err.println(this.getClass()+", update2 ...");
	}

	public void save(String name){
		System.err.println(this.getClass()+", save2 ... "+name);
	}
	
	public String update(String name){
		System.err.println(this.getClass()+", update2 ... "+name);
		return name;
	}

	public UserImpl2() {
		super();
		// TODO Auto-generated constructor stub
	}

}
