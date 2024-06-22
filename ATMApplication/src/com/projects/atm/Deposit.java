package com.projects.atm;

public class Deposit {
	public static void deposit(BankAcc account, double amount) {
		if(amount>0) {
			account.setBalance(account.getBalance()+amount);
			System.out.println(amount+" has been credited to your account.");
			System.out.println("Current Balance: "+account.getBalance());
		}else {
			System.out.println("Invalid amount to deposit.");
		}
	}
}
