package com.example.test.multi_threading;


//Lambda Expression of Example MultiThreadWithLambda2 final


public class MultiThreadWithLambda3 {

	public static void main(String[] args) {		
		
		
		new Thread( () -> new MultiThreadWithLambda2().show("Hello")).start();;		// only change 'Hello' to your required world
		
		try {Thread.sleep(10);}catch(Exception e) {System.out.println(e);}		//delay for not clashing each other at certain time
		
		new Thread( () -> new MultiThreadWithLambda2().show("Hi")).start();;		// only change 'Hi' to your required world
		

	}
	
	public void show(String str) {			//Passing String parameter and this parameter pass in show methods
		for(int i=0; i<5; i++) {
			System.out.println(str);		//Printing String that is Hi,Hello passed in show Method
			
			try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}		//delay for one second
		}
	}

}
