package com.BankDemo;

public class CreditCard implements Payment{
	
	@Override
	public String pay() {
		return "Payment completed through credit card";

	}

}
