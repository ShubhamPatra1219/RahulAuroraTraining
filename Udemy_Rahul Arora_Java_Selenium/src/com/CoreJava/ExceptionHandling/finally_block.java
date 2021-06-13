package com.CoreJava.ExceptionHandling;

public class finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x = 100;
		try {
			// DB Connection -- Successful
			// Executing Some Queries
			// Validating the Data and Comparing from WebSite
			// Closing the Connection
			int i[] = new int[4];
			i[5] = 100;
			System.out.println("Closing DB Connection in Try Block");
		} catch (Throwable t) {
			System.out.println("Error Occured!");
		} finally {
			System.out.println("Closing the DB Connection in Finally Block");
		}
	}

}
