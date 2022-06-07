package com.example.test;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		String s1,s2,s3;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter first String ");
		s1 = sc.nextLine();
		
		System.out.println("Enter second String ");
		s2 = sc.nextLine();
		
		s3 = s1.concat(s2);
		System.out.println("Concatenation of two String is : " + s3);
		
		
		
		
	}
}

