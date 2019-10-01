package com.lovecoding.Lists;

import java.util.ArrayList;
import java.util.List;

public class Branch {

	private List<Customer> customers=new ArrayList<>();
	

	private String branchName;
	
	public Branch(String branchName){
		this.branchName=branchName;
	}
	
	public void addCustomer(String name, double intialTransactionAmt){
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getName().equals(name)){
				System.out.println("Customer already exits...!");
			}
		}
		customers.add(new Customer(name, intialTransactionAmt));
		}
	
	public void addTransaction(String customerName, double amount){
		Customer customer=findCustomer(customerName);
		if(customer!=null){
			customer.getTransaction().add(amount);
		}
		else{
			System.out.println("No Customer found to add transaction amount...!");
		}
	}

	protected Customer findCustomer(String customerName) {
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getName().equals(customerName)){
				return customers.get(i);
			}
		}
		return null;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
