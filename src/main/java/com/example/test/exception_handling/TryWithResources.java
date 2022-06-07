package com.example.test.exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//when ever you create the BufferReader in the try and catch, we have to close the resources at the end using br.close();



public class TryWithResources {

	public static void main(String[] args) throws Exception {
		
		
		String str = "";
		
//		there is no need to close the resources at the end now because of using BufferedReader in try statement
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			
		System.out.println("Enter String...");
		
			str = br.readLine();
		}
		
		System.out.println(str);
		
		
		

	}

}
