package com.phoenix.services;

import java.util.List;

import com.phoenix.data.Product;
import com.phoenix.web.exceptions.ProductNotFoundException;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;

public interface ProductService {

	List<Product> findAll() throws ServiceException;
	Product findById(int id) throws ProductNotFoundException;
	void add(Product product) throws ServiceException;
	void edit(Product product) throws ServiceException;
	void remove(Product product) throws ServiceException;
	List<Product> sortByPrice() throws ServiceException;
	List<Product> sortByName() throws ServiceException;
	List<Product> sortByBrand() throws ServiceException;
	List<Product> findProductBetween(float minPrice,float maxPrice) throws ServiceException;
	List<Product> findByBrand(String brand) throws ServiceException;
	List<Product> findByPrice(float price) throws ServiceException;
	List<Product> findByName(String name) throws ServiceException;
	
}
