package com.Google.Real_interview;

import java.util.stream.IntStream;

public class joinArrays1 {
	int[] arr1 = { 1, 2, 3 };
	int[] arr2 = { 4, 5, 6 };

	int[] result = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
}