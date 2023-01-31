package com.iverson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iverson", "root", "rpsconsulting");

		// create the statement
		Statement stmt = conn.createStatement();

		// execute query
		// ddl-->execute(),dml-->executeUpdate(),drl--->executeQuery()
		//int result=stmt.executeUpdate("insert into iversonemps values(111,'mahesh',90000)");
	//	int result=stmt.executeUpdate("update iversonemps set esal=esal-5000");
	//	int result=stmt.executeUpdate("delete from iversonemps where eid=111");
		
					ResultSet result=stmt.executeQuery("select * from iversonemps");
					
					while(result.next())
					{
						
						System.out.println(result.getInt(1)+" "+result.getString("ename")+" "+result.getInt("esal"));
					}
		
		// close the connection

		conn.close();
		System.out.println(result+"Row Inserted ...........");
	}

}
