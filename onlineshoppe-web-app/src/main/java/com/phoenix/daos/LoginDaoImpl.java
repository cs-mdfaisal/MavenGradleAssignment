package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.User;
//DAO Data Access Object Interface Implementation
/*
 * version 2.0
 * @author md.faisal
 */
public class LoginDaoImpl implements LoginDao {
	
	
	private static Session session;
	static {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory =  cfg.buildSessionFactory();
		session=factory.openSession();
		System.out.println("Oracle Database connection established");
	
	
	}
	
	@Override
	public User getUserbyId(String username) {
		// TODO Auto-generated method stub
		return session.get(User.class, username);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from User");
		
		return query.getResultList();
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.save(tx);
		
		tx.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
		Transaction tx=session.beginTransaction();
		session.update(user);
		tx.commit();
	
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.delete(user);
		
		
		tx.commit();
	}
	
	
	
	}

