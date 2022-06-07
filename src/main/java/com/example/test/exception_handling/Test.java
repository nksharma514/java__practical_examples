package com.example.test.exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
	
public class Test {

	public static void main(String[] args) throws Exception {
		
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.parseInt(br.readLine());
		
		System.out.println(i);

	}

}	
