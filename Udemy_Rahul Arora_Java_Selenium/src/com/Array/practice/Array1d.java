package com.Array.practice;

public class Array1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [] = new int [5];
		String [] myArray = new String[13];
		//System.out.println(myArray.length);
		//System.out.println(array.length);
		array[0] = 10;
		array[2] = 20;
		array[4] = 30;
		//System.out.println(array[2]);
		for (int index = 0; index<array.length;index++)
		{
			array[index]=(int)(Math.random()*1000);
			//System.out.println(array[index]);
		}
		
		for (int var:array)
		{
			System.out.println(var);
		}
		
		System.out.println("---Printing in Reverse Order---");
		for (int index = array.length-1;index>=0;index--)
		{
			System.out.println(array[index]);
		}

	}

}
