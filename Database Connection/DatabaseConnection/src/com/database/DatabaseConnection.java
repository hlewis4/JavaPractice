package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username="root";
		String password="password";
		String url="jdbc:mysql://localhost:3306/dell";
		
		Connection con = (Connection) DriverManager.getConnection(url, username,password);
		if(con!=null)
			System.out.println("Connection established");
		PreparedStatement ps =(PreparedStatement) con.prepareStatement("delete from product where pid=?");
		ps.setInt(1,108);
		int x = ps.executeUpdate();
		if(x!=0)
			System.out.println("Record displayed");
		
		
				
		
		}
		
	
	}
	
	