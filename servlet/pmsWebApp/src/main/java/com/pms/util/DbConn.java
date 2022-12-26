package com.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	public static  Connection getConnection()  throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/pms","root","root");  
	  return con;
	}
}
