/*SavingsAccount.java
 * this class holds the information about interest rate and years
 * do the calculation and return the final amount
 * this class checks the condition for deposit and withdraw amount
 * 
 */

package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class SavingsAccount {

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

	// checking the conditions when customer withdraw or deposit amount
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

	//counting the future balance using futureValue=currentBalance(1+i)^n
	public double futureValue(int year) {
		return this.cBalance * Math.pow(1 + this.interestRate, years);
	}

	//toString method format and print the output using values that was pass to the variables
	//used \n to print statements in next lines

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Savings Account Balance : $" + cBalance +
				"\nSavings Account Interest Rate: " + this.interestRate +
				"\nSavings Account Balance in " + this.years + "years: " + df.format(futureValue(this.years));
	}

}