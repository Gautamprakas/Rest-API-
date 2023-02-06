package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


@Table(name="user table")
@Entity
public class Subject {
	
	@Id
	private String name;
        private String password;
        private String role;
        
        
	
	
	public Subject() {
		
	}
	public Subject(String name, String password,String role) {
		super();
		this.name = name;
		this.password = password;
                this.role = role;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
        public void setPassword(String password) {
		this.password = password;
	}
        public String getPassword() {
		return password;
	}
	 public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}

}
