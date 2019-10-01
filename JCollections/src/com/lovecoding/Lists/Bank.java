package com.lovecoding.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	
	private List<Branch> branches=new ArrayList<>();
	
	public void addBranch(String branchName) {

		if (findBranch(branchName)==null) {
			branches.add(new Branch(branchName));
			System.out.println("Branch "+branchName+" added successfully..!");
		}else{
			System.out.println("Branch already exists....!");
		}
	}
	
	public void addCustomer(String customerName, String branchName){
		Branch branch = findBranch(branchName);
		Customer customer = findCustomer(customerName);
		if(customer==null && branch!=null){
			branch.addCustomer(customerName, 0);
			System.out.println("Customer "+customerName+" added successfully..!");
		}else{
			System.out.println("Customer "+customerName+" already exists..!");
		}
	}

	private Branch findBranch(String branchName) {
		for (int i = 0; i < branches.size(); i++) {
			if (branches.get(i).getBranchName().equals(branchName)) {
				return branches.get(i);
			}
		}
		return null;
	}
	
	private Customer findCustomer(String customerName) {
		for (int i = 0; i < branches.size(); i++) {
			if(branches.get(i).findCustomer(customerName)!=null) 
				return branches.get(i).findCustomer(customerName);
		}
		return null;
	}
	
	public void findCustomers() {
		Scanner scr=new Scanner(System.in);
		String branchName=scr.nextLine();
		List<Customer> customers = null;
		scr.close();
		Branch branch = findBranch(branchName);
		if(branch!=null){
			customers=branch.getCustomers();
			System.out.println("\nBranch "+branchName+" Customers");
			for(int i=0; i<customers.size(); i++){
				System.out.println(customers.get(i).getName());
			}
		}
		else{
			System.out.println("Branch doesn't exists..!");
		}
		
		}
}

