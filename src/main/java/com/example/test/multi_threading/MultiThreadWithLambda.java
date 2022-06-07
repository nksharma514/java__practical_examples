package com.example.test.multi_threading;


//Lambda Expression of Example MultiThreading2


public class MultiThreadWithLambda {

	public static void main(String[] args) {
		
//		Abc obj1 = new Abc();
//		Thread t1 = new Thread(obj1);
//		t1.start();
		
//		Or,
		
		
		
		Thread t1 = new Thread( () ->
			{
				
				for(int i=0; i<5; i++) {
					System.out.println("Hi");
					
					try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
				}
				
			}
			
		);
		
		t1.start();
		
		
		try {Thread.sleep(10);}catch(Exception e) {System.out.println(e);}		//for not clashing each other at certain time
		
		
//		Abc1 obj2 = new Abc1();		
//		Thread t2 = new Thread(obj2);
//		t2.start();
		
//		Or,
		
		
		Thread t = new Thread( () ->
			{
				
				for(int j=0; j<5; j++) {
					System.out.println("Hello");					
					try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
				}
				
			}		
		);
		
		t.start();
		
		

	}

}

//class Abc extends Thread implements Runnable {
//	public void show() {
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("Hi");
//			
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//		
//	}
//	@Override
//	public void run() {
//		show();		
//	}
//}


//class Abc1 implements Runnable {
//	public void show() {
//		
//		for(int j=0; j<5; j++) {
//			System.out.println("Hello");
//			
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//		
//	}
//	@Override
//	public void run() {
//		show();		
//	}
//}
