package com.BankDemo;

public class DebitCard implements Payment{
	
	@Override
	public String pay() {
		return "Payment completed through Debit card";
	}

}
