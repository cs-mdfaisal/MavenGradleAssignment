package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.Product;

public interface ProductDao {

	
	//CRUD Methods
		Product getProductbyId(int id);
		List<Product>getAllProducts();
		void insert (Product product);
		void update (Product product);
		void delete (Product product);

	
}
