package com.example.test.exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputException {

	public static void main(String[] args) {
		
		int i,j,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// Taking User Input using BufferReder
		
		try {
			System.out.println("Enter I value ");		// Taking I value from User
			i = Integer.parseInt(br.readLine());		
			
			System.out.println("Enter J value ");		// Taking J value from User
			j = Integer.parseInt(br.readLine());
			
			k = i/j;
			
			System.out.println("Output is : " + k);
			
		}
		catch(IOException e) {
			System.out.println("Some IO Error " + e);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide By Zero " + e);
		}
		catch(Exception e) {
			System.out.println("Unknow Exception " + e);
		}
		finally{
			System.out.println("Bye Bye ...");
		}
	}

}
