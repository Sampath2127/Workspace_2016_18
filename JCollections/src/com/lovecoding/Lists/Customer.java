package com.lovecoding.Lists;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Double> transaction=new ArrayList<>();
	
	
	public Customer(String customerName, double transactionAmt) {
		this.name=customerName;
		transaction.add(transactionAmt);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Double> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Double> transaction) {
		this.transaction = transaction;
	}
}
