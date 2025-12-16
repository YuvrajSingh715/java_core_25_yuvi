package com.Google.oopsconcept.polymorphism;

public class MethodHidingC extends MethodHidingP {
	
//	@Override    //this is not method overriding. it is method hiding.
	public static void m1() {
		System.out.println("m1 method from child class.");
	}
	
//	@Override
//	public void m2() {
//		System.out.println("m2 method from child class.");
//	}
//	we can't override static method to non static method.

//  @Override
//	public static void m3() {
//		System.out.println("m2 method from parent class.");
//	}
//	we can't override non static method to static method.
	
}
