package com.kodnest.mysql;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Application Started.....");
		
		while(true) {	
			Projection.project();
			System.out.println();
			System.out.println("1. Insert the record");
			System.out.println("2. Update the record");
			System.out.println("3. Delete the record");
			System.out.println("4. Exit");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an option to execute DB operations: ");
			int option = sc.nextInt();
			
			switch(option) {
			case 1:
				Insertion.insert(sc);
				break;
			case 2:
				Updation.update(sc);
				break;
				
			case 3: 
				Deletion.delete(sc);
				break;
				
			case 4:
				System.out.println("Application Closed.....");
				System.exit(0);
				sc.close();
				
			default:
				System.out.println("Enter a valid option...");
				System.out.println();
			}
		}
	}
}
