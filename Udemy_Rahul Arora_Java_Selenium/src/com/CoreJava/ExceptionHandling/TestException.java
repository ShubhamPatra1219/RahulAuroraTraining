package com.CoreJava.ExceptionHandling;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Before Try Block!");
		try {
			System.out.println("Beginning");
			int divide = 10 / 0;
			System.out.println(divide);
			System.out.println("Ending");
		} catch (Exception e) {
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("After Try Catch Block!");
	}
}
