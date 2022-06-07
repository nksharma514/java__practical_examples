package com.example.test.multi_threading;


//Lambda Expression of Example MultiThreadWithLambda


public class MultiThreadWithLambda1 {

	public static void main(String[] args) {
		
		
		
		
		new Thread( () ->
			{
				
				for(int i=0; i<5; i++) {
					System.out.println("Hi");
					
					try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
				}
				
			}
			
		).start();;
		
		
		try {Thread.sleep(10);}catch(Exception e) {System.out.println(e);}		//for not clashing each other at certain time
		
		
		
		new Thread( () ->
			{
				
				for(int j=0; j<5; j++) {
					System.out.println("Hello");					
					try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
				}
				
			}		
		).start();;
		
		
		

	}

}
