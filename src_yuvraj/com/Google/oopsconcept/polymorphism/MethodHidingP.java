package com.Google.oopsconcept.polymorphism;

public class MethodHidingP {

	public static void m1() {
		System.out.println("m1 method from parent class.");
	}
	
	public static void m2() {
		System.out.println("m2 method from parent class.");
	}
	
	public void m3() {
		System.out.println("m3 method from parent class.");
	}

}
