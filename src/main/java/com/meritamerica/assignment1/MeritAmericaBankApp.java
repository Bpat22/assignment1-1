package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String[] args) {

		System.out.println("Hello, Java Cohort");

		AccountHolder customer = new AccountHolder("John", "Joe", "Doe", "123-45-6789", 100.0, 1000.0);
		
		System.out.println(customer.toString());
		
		customer.ca.deposit(500);
				
		System.out.println(customer.ca.toString());
		
		customer.sa.withdraw(800);
		
		System.out.println(customer.sa.toString());
	
		AccountHolder customer2 = new AccountHolder("Bina", "Ben", "Pat", "987-65-4321", 200, 500);
		
		customer2.ca.deposit(-500);
		
		customer2.sa.withdraw(600);
		
		System.out.println(customer2.toString());

		
	}
			
	
}