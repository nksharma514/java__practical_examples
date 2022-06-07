package com.example.test.multi_threading;

public class MultiThreading2 {

	public static void main(String[] args) {
		
//		Abc obj1 = new Abc();
//		Thread t1 = new Thread(obj1);
//		t1.start();
		
//		Or,
		
		Runnable r1 = new Runnable() 
		{
			public void run() {
				
				for(int i=0; i<5; i++) {
					System.out.println("Hi");
					
					try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
				}
				
			}
			
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		
		
		
//		Abc1 obj2 = new Abc1();		
//		Thread t2 = new Thread(obj2);
//		t2.start();
		
//		Or,
		
		Runnable r2 = new Runnable()
		{
			public void run() {
				
				for(int j=0; j<5; j++) {
					System.out.println("Hello");					
					try {Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
				}
				
			}		
		};
		
		Thread t = new Thread(r2);
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
