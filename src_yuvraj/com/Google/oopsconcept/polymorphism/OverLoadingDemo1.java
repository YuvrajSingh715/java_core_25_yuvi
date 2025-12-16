package com.Google.oopsconcept.polymorphism;

public class OverLoadingDemo1 {

	public static void main(String[] args) {
        System.out.println("++++++> Parameter order <++++++");
        m1("alpha", 1);      // calls m1(String,int)
        m1(2, "beta");       // calls m1(int,String)

        System.out.println("\n++++++> Var-args <++++++");
        m1(10, 20, 30);      // calls m1(int...)
        m1("x", "y", "z");   // calls m1(String...) 
	}
	
	
	// 1) Parameter order
	public static void m1(String s, int n) {
		System.out.println("m1(String, int) called -> order: String then int : " + s + ", " + n);
	}

	public static void m1(int n, String s) {
		System.out.println("m1(int, String) called -> order: int then String : " + n + ", " + s);
	}
	
	//Create a confusion inside the Parameter order
//	public void m1(int a , int b) {} 
//	private void m1(int b , int a) {}

	// 2) Var-args
	public static void m1(int... nums) {
		System.out.print("m1(int...) called -> var-args ints: ");
		for (int x : nums)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void m1(String... strs) {
		System.out.print("m1(String...) called -> var-args strings: ");
		for (String s : strs)
			System.out.print(s + " ");
	}

}
