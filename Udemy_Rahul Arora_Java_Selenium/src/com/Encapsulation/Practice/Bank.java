package com.Encapsulation.Practice;

public class Bank {

	public int accountNo = 123456;
	private int pinNo = 1234;
	private double balanceAmount = 100000;

	public void withdrawAmount(int accNo, int pin, int amount) {
		if (accNo == accountNo && pin == pinNo)
			if (amount <= balanceAmount) {
				balanceAmount = balanceAmount - amount;
				System.out.println("Amount gets deducted " + amount + " and the Account Balance is:" + balanceAmount);
			} else
				System.out.println("Insufficient Balance!");
		else
			System.out.println("Invalid Credentials!!");
	}

	public void updatePin(int accNo, int oldPin, int newPin) {
		if (accNo == accountNo && oldPin == pinNo) {
			pinNo = newPin;
			System.out.println("Pin Changed Successfully!");
		} else
			System.out.println("Invalid Credentials!!!");
	}

}
