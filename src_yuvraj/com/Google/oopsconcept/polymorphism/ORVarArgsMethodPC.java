package com.Google.oopsconcept.polymorphism;

public class ORVarArgsMethodPC {

	public static void main(String[] args) {
		
		//method m1  -->  follows method Overloading.
        //method m2  -->  follows method Overriding.  

		ORVarArgsMethodP p1 = new ORVarArgsMethodP();
		p1.m1(12);
		p1.m2("Yuvi");
		
		ORVarArgsMethodC c1 = new ORVarArgsMethodC();
		c1.m1(12);
		c1.m1(null);
		c1.m2(args);
		
		ORVarArgsMethodP p2 = new ORVarArgsMethodC();
		p2.m1(null);
		p2.m2(args);
		
//		ORVarArgsMethodC c2 = new ORVarArgsMethodP();
		
	}

}
