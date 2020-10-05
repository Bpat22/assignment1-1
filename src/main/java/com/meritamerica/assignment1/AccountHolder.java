package com.meritamerica.assignment1;

public class AccountHolder {

	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAcoountOpeningBalance;
	public CheckingAccount ca;	
	public SavingsAccount sa;

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

	public String toString() {
		String x = ("Name: " + getFirstName() + " " + getMiddletName() + " " + getLastName() +
		"\nSSN: " + getSSN()+
		"\n" + ca.toString()+
		"\n"+ sa.toString());
		
		return x;
	}
 	
}