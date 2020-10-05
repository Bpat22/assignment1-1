/*CheckingAccount.java
 * this class holds the information about interest rate and years
 * do the calculation and return the final amount
 * this class checks the condition for deposit and withdraw amount
 * 
 */

package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class CheckingAccount {

	/*variables using appropriate data types.
	 * cBalance (current balance), interest rate for Checking account (0.0001), years(3)
	 */  

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

	// checking the conditions when customer withdraw or deposit amount

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
	//counting the future balance using futureValue=currentBalance(1+i)^n

	public double futureValue(int years) {

		return this.cBalance * Math.pow(1 + this.interestRate, years);
	}

	//toString method format and print the output using values that was pass to the variables 
	//used \n to print statements in next lines

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Checking Account Balance: $" + cBalance + 
				"\nChecking Account Interest Rate: " + this.interestRate + 		
				"\nChecking Account Balance in " + this.years + " years: " + df.format(futureValue(this.years));
	}

}