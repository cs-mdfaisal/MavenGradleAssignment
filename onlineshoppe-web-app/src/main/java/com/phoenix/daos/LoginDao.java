package com.phoenix.daos;

import java.util.List;

/*
 * @author md.faisal
 */
import com.phoenix.data.User;
//DAO Data Access Object Interface
public interface LoginDao {
	
	//CRUD Methods
	User getUserbyId(String username);
	List<User>getAllUsers();
	void insert (User user);
	void update (User user);
	void delete (User user);

}
