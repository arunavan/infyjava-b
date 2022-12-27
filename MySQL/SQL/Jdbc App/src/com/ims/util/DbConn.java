package com.ims.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	
	public static  Connection getConnection()  throws SQLException,ClassNotFoundException{
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/ims","root","root");  
	  return con;
	}

}
