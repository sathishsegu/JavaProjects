package com.projects.atm;

public class BankAcc {
	private double balance;
	
	public BankAcc(double balance) {
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
