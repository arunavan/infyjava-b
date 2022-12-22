package com.ims.service;

import java.sql.SQLException;

import com.ims.dao.ProductDAO;
import com.ims.dao.ProductDAOImpl;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;

public class ProductServiceImpl implements ProductService  {
	 
		public boolean updateProduct(Product product) throws SQLException,ClassNotFoundException,ProductNotFoundException{
			ProductDAO productDao=new ProductDAOImpl();
			boolean result =productDao.updateProduct(product);
		    return result;

	}

}
