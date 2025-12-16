package com.Google.flowcontrol.IterativeStat;

public class WhileLoopEvenDemo {

	public static void main(String[] args) {

		int d = 1;

		while (d <= 50) {
			if (d % 2 == 0) {
				System.out.println(d);
			}
			
			d++;

		}
	}

}
