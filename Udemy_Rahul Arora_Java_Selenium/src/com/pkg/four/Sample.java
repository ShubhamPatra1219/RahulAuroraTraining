package com.pkg.four;

import com.pkg.three.Test;

public class Sample extends Test {

	public static void main(String[] args) {
		Sample obj = new Sample();
		//System.out.println(obj.privateVariable);//Private Not Accessible Outside Package
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);//Protected Not Accessible Outside Package
		//System.out.println(obj.defaultVariable);//Default Not Accessible Outside Package
		
		Sample obj1 = new Sample();
		System.out.println(obj1.publicVariable);

	}

}
