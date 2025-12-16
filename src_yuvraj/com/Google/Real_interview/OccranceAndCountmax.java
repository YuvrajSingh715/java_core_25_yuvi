package com.Google.Real_interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Q. Find the Highest Count (Max Occurrence)

public class OccranceAndCountmax {

	public static void main(String[] args) {

//  find the max value from values method.

		List<Integer> integerList = Arrays.asList(2, 4, 2, 4, 3, 6, 3, 6, 3, 5, 3, 5);

		Map<Integer, Long> integerCount = integerList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(integerCount);

		Long maxOccurance = integerCount.values().stream().max(Long::compare).get();

		System.out.println("Maximum Occurence = " + maxOccurance);

//	find the max value from entrySet method.

		integerCount.entrySet().stream()
				.forEach(e -> System.out.println("key : " + e.getKey() +"   "+"values : " + e.getValue()));
		
//  find by the max Occurence value
		
		integerCount.entrySet().stream().filter(n -> n.getValue() == 4).forEach(System.out :: println);
	}
}
