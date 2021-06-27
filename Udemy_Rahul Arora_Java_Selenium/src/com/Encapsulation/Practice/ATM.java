package com.Encapsulation.Practice;

public class ATM {
	
	public static void main(String[] args) 
	{
		Bank obj = new Bank();
		//obj.pinNo = 2222;
		//obj.balanceAmount = 100000000;
		obj.updatePin(123456, 1234, 3333);
		obj.withdrawAmount(123456, 3333, 100);
	}
}
