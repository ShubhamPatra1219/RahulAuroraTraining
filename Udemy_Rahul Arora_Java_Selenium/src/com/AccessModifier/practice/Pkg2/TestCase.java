package com.AccessModifier.practice.Pkg2;

import com.AccessModifier.practice.Pkg1.ClassA;
import com.AccessModifier.practice.Pkg1.ClassB;

public class TestCase {

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.Add();
		
		ClassB obj1 = new ClassB();
		obj1.show();

	}

}
