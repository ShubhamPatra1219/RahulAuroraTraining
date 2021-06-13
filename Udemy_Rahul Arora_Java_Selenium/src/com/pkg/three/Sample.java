package com.pkg.three;

public class Sample {
	
	public static void main(String[] args) {
		
		Test obj = new Test();
		//System.out.println(obj.privateVariable); - Private is not Accessible Outside Own Class.
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
	}

}
