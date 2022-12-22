package com.ims.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ims.dao.ProductDAO;
import com.ims.dao.ProductDAOImpl;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;

class ProductDAOImplTest {
	//ProductDAO productDao;
	@BeforeEach
	void setup() {
		//productDao=new ProductDAOImpl();
	}
	@Test
	void test() throws SQLException,ClassNotFoundException,ProductNotFoundException{
		ProductDAO productDao=new ProductDAOImpl();
		Product p=new Product(101,"box",99.99,9.00);
		boolean result=productDao.updateProduct(p);
		
		assertTrue(result);
		
	}

}
