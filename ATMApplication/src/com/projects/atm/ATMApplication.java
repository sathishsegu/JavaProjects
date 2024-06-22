package com.projects.atm;

import java.util.Scanner;

public class ATMApplication {
	public static void main(String[] args) {
		System.out.println("Application started.....");
		
		BankAcc account = new BankAcc(0);
		
		while(true) {
			System.out.println();
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Cash");
			System.out.println("3.Withdrawl Cash");
			System.out.println("4.Exit");
			
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter the option to perform: ");
			int op = sc.nextInt();
			
			switch(op) {
			case 1:
				CheckBalance.checkBalance(account);
				break;
			case 2:
				System.out.println("Enter amount to deposit: ");
				double depositAmount = sc.nextDouble();
				Deposit.deposit(account, depositAmount);
				break;
			case 3:
				System.out.println("Enter amount to withdrawl: ");
				double withdrawlAmount = sc.nextDouble();
				Withdrawl.withdrawl(account, withdrawlAmount);
				break;
			case 4: 
				System.out.println("Application closed......");
				System.exit(0);
				sc.close();
				break;
				
			default:
				System.out.println("Entered an Invalid Option!");
			}
		}
	}
}
