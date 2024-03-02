package com.BankDemo;

public class BillCollector {
	Payment payment;
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void billpay(double amount) {
		String result = payment.pay();
		System.out.println(result);
	}

}
