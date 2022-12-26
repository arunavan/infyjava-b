package com.pms.service;

import java.sql.SQLException;
import java.util.List;

import com.pms.model.Product;

public interface ProductService {
	public String addProduct(Product product)throws SQLException,ClassNotFoundException;
	public List<Product> listAllProducts()throws SQLException,ClassNotFoundException;

}
