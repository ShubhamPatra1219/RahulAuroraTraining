package com.Encapsulation.Practice;

public class Bank {

	public int accountNo = 123456; //Instance Variable
	private int pinNo = 1234; //Instance Variable
	private double balanceAmount = 100000; //Instance Variable
	

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

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
	
	public double depositCash(int accNo, int pin, double amount)
	{
		if (accNo == accountNo && pin == pinNo)
			balanceAmount = balanceAmount+amount;
		else System.out.println("Invalid Credentials!!");
		return balanceAmount;
	}

}
