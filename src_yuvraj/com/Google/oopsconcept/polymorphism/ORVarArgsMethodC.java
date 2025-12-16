package com.Google.oopsconcept.polymorphism;

public class ORVarArgsMethodC extends ORVarArgsMethodP {
	
//	@Override
	public void m1(int i) {
		System.out.println("child class Var-args m1 method.");
	} 
/*
* It is method overloading, it is not method overriding. 
* Var-args in the parent class and a normal method in the child class do NOT 
* create overriding.
*/	
	
	
	@Override
	void m2(String...s) {
		System.out.println("child class Var-args m2 method");
	}
// if you have var-args method inside the both class. than you can override these method.

}
