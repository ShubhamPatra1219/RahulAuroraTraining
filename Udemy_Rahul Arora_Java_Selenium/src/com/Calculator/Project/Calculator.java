package com.Calculator.Project;

public class Calculator {

	/*
	 * ClassName - TheDarkNight methodName - theDarkNight CTRL+SHIFFT+F --> Align
	 * everything properly.
	 */

	public Calculator() {

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

		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.div();
		calc.mult();
	}

}
