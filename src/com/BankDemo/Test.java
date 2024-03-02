package com.BankDemo;

public class Test {
	
	public static void main(String[] args) {
		BillCollector b = new BillCollector();
		b.setPayment(new CreditCard());
		b.billpay(1500);
		
	}

}
