package com.Google.operators;

public class NaNComparisonDemo {

	public static void main(String[] args) {

		float x = 10;
		float n = Float.NaN;

		System.out.println("x = " + x);
		System.out.println("NaN = " + n);
		System.out.println("--------------------");

		System.out.println("10 >  NaN : " + (x > n)); // false
		System.out.println("10 <  NaN : " + (x < n)); // false
		System.out.println("10 >= NaN : " + (x >= n)); // false
		System.out.println("10 <= NaN : " + (x <= n)); // false

		System.out.println("10 == NaN : " + (x == n)); // false
		System.out.println("10 != NaN : " + (x != n)); // TRUE

		System.out.println("--------------------");

		// NaN compared with NaN
		System.out.println("NaN == NaN : " + (Float.NaN == Float.NaN)); // false
		System.out.println("NaN != NaN : " + (Float.NaN != Float.NaN)); // TRUE
	}
}
