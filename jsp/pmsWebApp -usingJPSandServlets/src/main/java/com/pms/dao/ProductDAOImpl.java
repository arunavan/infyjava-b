package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pms.model.Product;
import com.pms.util.DbConn;

public class ProductDAOImpl implements ProductDAO{
	
	public ProductDAOImpl(){
		
	}
	public String addProduct(Product product) throws SQLException,ClassNotFoundException{
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
		pst.setInt(1,product.getId());
		pst.setString(2,product.getName());
		pst.setDouble(3,product.getQty());
		pst.setDouble(4,product.getPrice());
		pst.execute();
		return "success";
	}
	public List<Product> listAllProducts()throws SQLException,ClassNotFoundException{
		List<Product> plist=new ArrayList<>();
		Connection con=DbConn.getConnection();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next()) {
			Product p=new Product();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setQty(rs.getDouble(3));
			p.setPrice(rs.getDouble(4));
			plist.add(p);
		}
		return plist;
		
	}
}
