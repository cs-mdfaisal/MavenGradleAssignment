package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;
//Service Interface Implementor Class
public class LoginServiceImpl implements LoginService {
	
	//Invokes DAO layer
	private LoginDao loginDao;
	public LoginServiceImpl() {
		//Creating DAO Implementor object in service layer
		loginDao=new LoginDaoImpl();
	}
	
	@Override
	public List<User> findAll() throws ServiceException{
		return loginDao.getAllUsers();
	}

	@Override
	public User findById(String username) throws UserNotFoundException {
		User user = loginDao.getUserbyId(username);
		if(user!=null)
		
		return user;
		else
			throw new UserNotFoundException("User not found");
	}

	@Override
	public void add(User user) throws ServiceException {
		loginDao.update(user);
	}

	@Override
	public void edit(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(User user) throws ServiceException{
		loginDao.delete(user);
	}

	@Override
	public List<User> sortByUsername() throws ServiceException {
		List<User> users = loginDao.getAllUsers();
		//sort users by username
		return users;
	}

	@Override
	public List<User> sortByPassword() throws ServiceException{
		// TODO Auto-generated method stub
		
		List<User> users;
		users = loginDao.getAllUsers();
		return users;
	
		
	}

	@Override
	public String changePassword(String newPassword)throws ServiceException{
		User user = new User();
		user.setPassword(newPassword);
		loginDao.update(user);
		return "Password is updated successfully";
	}

}
