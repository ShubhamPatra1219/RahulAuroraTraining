package com.AccessModifier.practice.Pkg4;

import com.AccessModifier.practice.Pkg3.Test;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		//System.out.println(obj.privateVariable);
		System.out.println(obj.publicVariable);
		//System.out.println(obj.protectedVariable);
		//System.out.println(obj.defaultVariable);
		
		Sample s = new Sample();
		//System.out.println(s.publicVariable);
//		int[] x = new int[5];
//		int[] y = {10,20,30,40,50,60};
//		System.out.println(x[1]);
//		System.out.println(y[1]);
		
	}

}
