package com.kodnest.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Projection {
	public static void project() throws ClassNotFoundException , SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnest";
		String uName = "root";
		String pwd = "1561";
		
		Connection conn = DriverManager.getConnection(url, uName, pwd);
		
		Statement stmt = conn.createStatement();
		
		String query = "select * from Student";
		
		ResultSet rs = stmt.executeQuery(query);
		
		System.out.println("--------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2));
		}
		System.out.println("--------------------");
	}
}
