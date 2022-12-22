package com.ims.service;

import java.sql.SQLException;

import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;

public interface ProductService {
	
	boolean updateProduct(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException;

}