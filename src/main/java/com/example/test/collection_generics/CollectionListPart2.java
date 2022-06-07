package com.example.test.collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
List :- 1. It has Index Number.
		2. Data can be Duplicate.
		3. New Data can be add at any Index value
		4. List is a Interface and ArrayList is a class
		5. Sorting of Data is possible because of Index Number
*/

public class CollectionListPart2 {

	public static void main(String[] args) {
		
		
		List<Integer> value = new ArrayList<>();
		value.add(5);
		value.add(2);
		value.add(6);
		value.add(3);
		value.add(4);
		
		System.out.println("Printing all values");		
		value.forEach(System.out::println);				// Stream API, 
		
		
		value.add(2,8);		//Adding new element 8 in between 2 nad 6.
		
		
		System.out.println("Adding new integer value 8 after value 2 and before value 6");		
		value.forEach(System.out::println);
		
		
		Collections.sort(value);		//for sorting
		
//		for(int i : value) {
//			System.out.println(i);
//		}
		
		
//		Or,
		
		System.out.println("After Sorting of Numbers");		
		value.forEach(System.out::println);			// Stream API, Lambda Expression to print like for loop
		

	}

}
