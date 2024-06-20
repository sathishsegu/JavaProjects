package com.kodnest.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletion {
	public static void delete(Scanner sc) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/DBName";
		String uName = "Enter Your UserName";
		String pwd = "Enter Your Password";
		
		Connection conn = DriverManager.getConnection(url, uName, pwd);
		
		String query = "delete from student where id = ?";
		
		System.out.println("Enter ID to delete the record: ");
		int id = sc.nextInt();
		
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setInt(1, id);
		
		int eu = ps.executeUpdate();
		
		if(eu==1) {
			System.out.println(eu +" row affected.");
			System.out.println();
		}else {
			System.out.println(eu +" rows affected.");
			System.out.println();
		}
	}
}
