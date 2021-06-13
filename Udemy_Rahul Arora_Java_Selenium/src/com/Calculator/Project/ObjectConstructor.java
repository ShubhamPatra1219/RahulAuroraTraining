package com.Calculator.Project;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectConstructor {

	public ObjectConstructor() {

		System.out.println("Calling Constructor");
	}

	public void add() {

		System.out.println("Adding some numbers");
	}

	public void sub() {

		System.out.println("Subtracting some numbers");
	}

	public void div() {

		System.out.println("Dividing some numbers");
	}

	public void mult() {

		System.out.println("Multiplying some numbers");
	}

	public static void main(String[] args) {

			//Calculator calc; //= 
			new Calculator().add();
			new Calculator().sub();
			new Calculator().div();
            new Calculator().mult();
            
     FirefoxDriver driver = new FirefoxDriver ();
     driver.get("https://way2automation.com");
           
	}

}
