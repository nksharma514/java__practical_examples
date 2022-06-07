package com.example.test.array_example;

public class StringSplit {

	public static void main(String[] args) {

		String str = "Naren,Narendra,Raju,Aman,Kumar";

		String names[] = str.split(","); 	// Separated by comma here for index value and converted into array

		System.out.println(names[1] + "\n");	//Fetching String by index value

		for (String s : names) {				//Printing all String
			System.out.println(s);
		}

	}

}
