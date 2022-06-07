package com.example.test.multi_threading;


//Lambda Expression of Example MultiThreadWithLambda1


public class MultiThreadWithLambda2 {

	public static void main(String[] args) {
		
		
		
		
		new Thread( () ->
			{
				
				new MultiThreadWithLambda2().show("Hello");
				
			}
			
		).start();;
		
		
		try {Thread.sleep(10);}catch(Exception e) {System.out.println(e);}		//for not clashing each other at certain time
		
		
		
		new Thread( () ->
			{
				
				new MultiThreadWithLambda2().show("Hi");
				
			}		
		).start();;
		
		
		

	}
	
	public void show(String str) {
		for(int i=0; i<5; i++) {
			System.out.println(str);
			
			try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
		}
	}

}
