package com.lovecoding.Lists;

public class Main {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		
		bank.addBranch("Hyderabad");
		bank.addBranch("Vijayawada");
		bank.addBranch("Hyderabad");
		bank.addCustomer("Sam", "Hyderabad");
		bank.addCustomer("Sam", "Hyderabad");
		bank.addCustomer("Kiran", "Hyderabad");
		bank.addCustomer("Praveen", "Hyderabad");
		bank.addCustomer("Madhu", "Vijayawada");
		bank.addCustomer("Sunny", "Vijayawada");
		bank.findCustomers();
	}

}
