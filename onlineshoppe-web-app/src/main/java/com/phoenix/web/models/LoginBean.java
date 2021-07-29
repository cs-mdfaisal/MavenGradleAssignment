package com.phoenix.web.models;

import java.sql.SQLException;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.services.LoginService;
import com.phoenix.services.LoginServiceImpl;
import com.phoenix.web.exceptions.UserNotFoundException;

/*
 * @author md.faisal
 * version 1.0
 * creation date - 25-06-2021
 */
//Presentation Layer
// JavaBean-MVC-Model-JavaBean Focuses on Business logic in MVC Design pattern

public class LoginBean {
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
	
	//Business logic method
	public boolean isValid() throws UserNotFoundException {
		
		
			//Invokes service layer-Business Layer
			//LoginDao loginDao = new LoginDaoImpl();
			LoginService loginService = new LoginServiceImpl();
			User dbUser = loginService.findById(username);
			if(username!=null && password!=null
					&& dbUser!=null
					&& password.equals(dbUser.getPassword()))
				return true;
			else
				return false;
		
		
	}
	
	
}
