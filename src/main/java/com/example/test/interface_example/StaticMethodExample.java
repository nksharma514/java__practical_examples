package com.example.test.interface_example;

interface Draw{
	void draw();
	static int cube(int x) {return x*x*x;}
}
class Test implements Draw{
	public void draw() {
		System.out.println("Calling Test Method...");
	}
}


public class StaticMethodExample {

	public static void main(String[] args) {
		
		
		Draw obj = new Test();
		obj.draw();
		System.out.println(Draw.cube(3));
		

	}

}
