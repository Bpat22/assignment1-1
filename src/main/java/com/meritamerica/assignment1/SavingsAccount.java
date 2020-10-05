package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class SavingsAccount {

	// private double openingBalance;
	// private static final double INT_RATE = 0.01;
	private double cBalance;
	private double interestRate = 0.01;
	private int years = 3;

	public SavingsAccount(double openingBalance) {
		
		this.cBalance = openingBalance;
		//this.interestRate = 0.01;
		//this.years = 3;
	}

	public double getBalance() {
		return this.cBalance;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public boolean withdraw (double amount) {
		if (amount < 0 || amount > cBalance) {
			// (amount < 0 || amount > this.cBalance)
			System.out.println("Withdraw amount is greater than current balance in Savings Account. Please, try different amount.");
			return false;
		} else {
			//cBalance = cBalance - amount;
			this.cBalance = this.cBalance - amount;
			return true;
		}
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			//cBalance = cBalance + amount;
			this.cBalance = this.cBalance + amount;
			return true;
		} else {
			System.out.println("You can not deposite negative amount in Savings Account. Please try again.");
			return false;
		}
	}

	public double futureValue(int year) {
		return this.cBalance * Math.pow(1 + this.interestRate, years);
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Savings Account Balance : $" + cBalance +
		"\nSavings Account Interest Rate: " + this.interestRate +
		"\nSavings Account Balance in " + this.years + "years: " + df.format(futureValue(this.years));
	}
	
	
}