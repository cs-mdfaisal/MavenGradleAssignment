package com.phoenix.data;
//Value object class-Java bean class- pojo- persistent class or emtity class
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LOGIN")

public class User {
	@Id
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
