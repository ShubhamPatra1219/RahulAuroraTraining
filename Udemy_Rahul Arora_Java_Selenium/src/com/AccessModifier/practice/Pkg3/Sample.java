package com.AccessModifier.practice.Pkg3;

public class Sample {
	
	public static void main(String[] args) {
		
		Test obj = new Test();
		//System.out.println(obj.privateVariable);
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
	}

}
