package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class CheckingAccount {

	//private double openingBalance;
	//private static final double INT_RATE = 0.0001;
	private double cBalance;
	private double interestRate = 0.0001;
	private int years = 3;

	public CheckingAccount (double openingBalance) {
		
		this.cBalance = openingBalance;
		//this.interestRate = 0.0001;
		//this.years = 3;
	}

	public double getBalance() {
		return this.cBalance;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public boolean withdraw (double amount) {
		if (amount < 0 || amount > cBalance ) {
			System.out.println("Withdraw amount is greater than current balance in Checking Account. Please, try different amount.");
			return false;
			
		} else {
			this.cBalance = this.cBalance - amount;
			return true;
		}
	}

	public boolean deposit (double amount) {
		if (amount > 0 ) {
			this.cBalance = this.cBalance + amount;
			
			return true;
		} else {
			System.out.println("You can not deposite negative amount in Checking Account. Please try again.");
			return false;
		}
	}

	public double futureValue(int years) {

		return this.cBalance * Math.pow(1 + this.interestRate, years);
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Checking Account Balance: $" + cBalance + 
		"\nChecking Account Interest Rate: " + this.interestRate + 		
		"\nChecking Account Balance in " + this.years + " years: " + df.format(futureValue(this.years));

		
	}


}