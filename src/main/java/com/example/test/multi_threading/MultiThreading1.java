package com.example.test.multi_threading;

public class MultiThreading1 {

	public static void main(String[] args) {
		
		A obj1 = new A();
		obj1.start();
		
		B obj2 = new B();
		obj2.start();
		
		
		

	}

}

class A extends Thread {
	public void show() {
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello...");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	@Override
	public void run() {
		show();		
	}
}


class B extends Thread {
	public void show() {
		
		for(int j=0; j<5; j++) {
			System.out.println("World...");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	@Override
	public void run() {
		show();		
	}
}
