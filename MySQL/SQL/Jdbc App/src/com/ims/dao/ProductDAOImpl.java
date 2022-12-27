package com.ims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;
import com.ims.util.DbConn;

public class ProductDAOImpl implements ProductDAO{
	public boolean updateProduct(Product product) throws SQLException,ProductNotFoundException,ClassNotFoundException{
	Connection con=DbConn.getConnection();	
	Statement st=con.createStatement();
	boolean flag=false;
	ResultSet rs=st.executeQuery("select id from product");
	while(rs.next()) {
		Integer id=Integer.parseInt(rs.getString(1));
		if( product.getId()==id)
			flag=true;
	}
	if(flag ) {
		PreparedStatement pst=con.prepareStatement("update product set qty=? where id=?");
		pst.setDouble(1, product.getQty());
		pst.setInt(2, product.getId());
		pst.execute();
	}
	else
		throw new ProductNotFoundException("Product Not Found - Update cannot be done");
		return flag;
	}

}
