package com.kodnest.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertion {
	public static void insert(Scanner sc) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnest";
		String uName = "root";
		String pwd = "1561";
		
		String query = "insert into student values(?,?)";
		
		Connection con = DriverManager.getConnection(url,uName,pwd);
		
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter Name: ");
		String name = sc.nextLine();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		
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
