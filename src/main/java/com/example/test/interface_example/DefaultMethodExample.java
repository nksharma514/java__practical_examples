package com.example.test.interface_example;


interface Drawable{
	void show();
	default void msg() {
		System.out.println("Calling Default Method....");
	}
}
class Rectangle implements Drawable{
	public void show() {
		System.out.println("Calling Show Method....");
	}
}



public class DefaultMethodExample {

	public static void main(String[] args) {
		
		Drawable obj = new Rectangle();
		obj.show();
		obj.msg();
		

	}

}
