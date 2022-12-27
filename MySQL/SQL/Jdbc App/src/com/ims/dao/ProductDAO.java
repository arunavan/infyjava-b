package com.ims.dao;

import java.sql.SQLException;

import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;

public interface ProductDAO {
	
	boolean updateProduct(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException;

}
