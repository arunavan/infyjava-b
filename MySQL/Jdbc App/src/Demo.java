import java.sql.*;
import java.util.Scanner;


public class Demo {
	
	

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		//step1 
	//	Class.forName("com.mysql.jdbc.Driver");
		
		//step2
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/jdbcdb","root","root");  
		/*
		CallableStatement cst=con.prepareCall("{ CALL sqr(?,?) }");
		cst.setInt(1, 8);
		cst.registerOutParameter(2,JDBCType.INTEGER);
		cst.execute();
		int b=cst.getInt(2);
		System.out.println(b);
		*/
		/*
		 * //step3 PreparedStatement
		 * pst=con.prepareStatement("insert into project values(?,?,?)"); Scanner sc=new
		 * Scanner(System.in); System.out.println("enter 3 project details"); for(int
		 * i=1;i<=3;i++) { int id=sc.nextInt(); sc.nextLine(); String
		 * name=sc.nextLine(); int duration=sc.nextInt();
		 * 
		 * pst.setInt(1, id); pst.setString(2, name); pst.setInt(3, duration);
		 * pst.execute(); } Statement st=con.createStatement(); //ddl,dml //
		 * st.executeUpdate("create table project(id int,name varchar(20),duration int)"
		 * );
		 * 
		 * //st.executeUpdate("update project set name='fms' where id=1"); //
		 * st.executeUpdate("delete from project where id=2"); //
		 * st.executeUpdate("insert into project values(3,'lms',24)");
		 */
		Statement st=con.createStatement();
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getURL());
		
		 ResultSet rs=st.executeQuery("select * from project");
		 ResultSetMetaData rsmd=rs.getMetaData();
		 System.out.println(rsmd.getColumnCount());
		 for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i)+"    "); 
		 }
		 System.out.println();
		 while(rs.next()) {
		  
		  System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		   }
		  
		 System.out.println("table created..");
		 
		

	}

}
