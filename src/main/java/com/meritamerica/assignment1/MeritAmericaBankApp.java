/*MeritAmericaBAnkApp.java
 * this is the main class for this app
 * 
 */

package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	//main method takes the input and calls the functions
	//print the output using values that was pass to the variables
	public static void main(String[] args) {

		System.out.println("Hello, Java Cohort");

		//Instantiate AccountHolder customer and by passing the values
		AccountHolder customer = new AccountHolder("John", "Joe", "Doe", "123-45-6789", 100.0, 1000.0);

		//pass values to appropriate variables and call the toString function from AccountHolder class
		System.out.println(customer.toString());

		//Makes deposit to Checking Account, Calculate the future value, store it in toString function in Checking Account Class 		
		customer.ca.deposit(500);

		System.out.println(customer.ca.toString());

		//Makes withdrawal from Savings Account, Calculate the future value, store it in toString function in Savings Account Class 		
		customer.sa.withdraw(800);

		System.out.println(customer.sa.toString());


		//Instantiate AccountHolder creating customer2 and by passing the values
		AccountHolder customer2 = new AccountHolder("Bina", "Ben", "Pat", "987-65-4321", 200, 500);

		//Makes deposit to Checking Account, Calculate the future value, store it in toString function in Checking Account Class 
		//prints the error message when conditions are not met 
		customer2.ca.deposit(-500);

		//Makes withdrawal from Savings Account, Calculate the future value, store it in toString function in Savings Account Class
		//prints the error message when conditions are not met 
		customer2.sa.withdraw(600);

		//pass values to appropriate variables and call the toString function from AccountHolder class
		System.out.println(customer2.toString());

	}

}