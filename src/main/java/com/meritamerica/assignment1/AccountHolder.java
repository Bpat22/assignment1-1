/*AccountHolder.Java
 * this class holds basic information about customer
 * gets the information from Checking Account and Savings Account for customer to see the balance and interest earned over 3 years
 */

package com.meritamerica.assignment1;

public class AccountHolder {
	//this class contains variables for customer first name, middle name, last name and SSN number.
	//all variables are String data type, getting the value from user and assigning to that variable.

	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	public double checkingAccountOpeningBalance;
	public double savingsAcoountOpeningBalance;
	public CheckingAccount ca;	
	public SavingsAccount sa;

	//constructor AccountHolder

	public AccountHolder (String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;

		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		ca = new CheckingAccount(checkingAccountOpeningBalance);

		this.savingsAcoountOpeningBalance = savingsAccountOpeningBalance;
		sa = new SavingsAccount(savingsAccountOpeningBalance);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}

	public String getMiddletName() {
		return middleName;
	}

	public void setMiddleName(String MiddleName) {
		this.middleName = MiddleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String LastName) {
		this.lastName = LastName;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String SSN) {
		this.ssn = SSN;
	}

	public CheckingAccount getCheckingAccount()	{
		return this.ca;
	}

	public SavingsAccount getSavingsAccount() {
		return this.sa;
	}

	// format and print the output using values that was pass to the variables by calling the function
	//used \n to print statements in next lines
	public String toString() {
		String x = ("Name: " + getFirstName() + " " + getMiddletName() + " " + getLastName() +
				"\nSSN: " + getSSN()+
				"\n" + ca.toString()+
				"\n"+ sa.toString());

		return x;
	}

}