package com.Google.Real_interview;

public class JoinArrays {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] result = new int[arr1.length + arr2.length];

		int index = 0;

		// copy first array
		for (int i = 0; i < arr1.length; i++) {
			result[index++] = arr1[i];
		}

		// copy second array
		for (int i = 0; i < arr2.length; i++) {
			result[index++] = arr2[i];
		}

		// print result
		for (int num : result) {
			System.out.print( num + " ");
		}
	}
}
