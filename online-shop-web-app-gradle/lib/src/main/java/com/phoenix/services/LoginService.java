package com.phoenix.services;

import java.util.List;

import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;

public interface LoginService {
//DAO-Data Access Object Interface
	
	List<User>findAll() throws ServiceException;
	User findById(String username) throws UserNotFoundException;
	void add(User user) throws ServiceException;
	void edit(User user) throws ServiceException;
	void remove(User user) throws ServiceException;
	List<User> sortByUsername() throws ServiceException;
	List<User> sortByPassword() throws ServiceException;
	String changePassword(String newPassword) throws ServiceException;
	
	

	
	
	
}
