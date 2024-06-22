package com.projects.atm;

public class Withdrawl {
	public static void withdrawl(BankAcc account, double amount) {
		
		if(amount>0) {
			if(amount<=account.getBalance()) {
				account.setBalance(account.getBalance()-amount);
				System.out.println(amount+" has been debited from the account.");
				System.out.println("Currrent Balance: "+account.getBalance());
			}else {
				System.out.println("Insufficient Funds");
			}
		}else {
			System.out.println("Invalid amount to withdrawl");
		}
	}
}
