package com.CoreJava.ExceptionHandling;

public class ArrayException {

	public static void main(String[] args) {
		System.out.println("Beginning");
		try {
			int i[] = new int[4];
			i[5] = 100;
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		System.out.println("Ending");
	}
}
