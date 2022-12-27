package com.ims.ui;

import java.sql.SQLException;

import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;
import com.ims.service.ProductService;
import com.ims.service.ProductServiceImpl;

public class ProductClient {

	public static void main(String[] args) throws SQLException,ClassNotFoundException,ProductNotFoundException{
		
		
		Product p=new Product(101,"box",897.99,34.89);
        ProductService productService=new ProductServiceImpl();
        productService.updateProduct(p);
	}

}
