package com.kodnest.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updation {
	public static void update(Scanner sc) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnest";
		String uName = "root";
		String pwd = "1561";
		
		Connection con = DriverManager.getConnection(url, uName, pwd);
		
		String query = "update student set name = ? where id = ?";
		
		System.out.println("enter ID where you want to Update the record: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter new Name: ");
		String newName = sc.nextLine();
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(2, id);
		ps.setString(1, newName);
		
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
