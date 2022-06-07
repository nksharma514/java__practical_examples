package com.example.test.this_keyword;

// Three types of variable, Instance variable, Local Variable, Class Variable

// 1. Instance Variable:- Instance variable is in side the class but outside the method
// 2. Local Variable:- Local variable which is inside the method, or declare inside the method
// 3. Class Variable:- class variable is something which is define inside the class but it's static variable

class A {

	private int x; // Instance variable

	public A(int x) { // Local Variable

		this.x = x; // Current Instance // this keyword referring to the private current instance
					// variable
	}

	public void show() {
		System.out.println(x);
	}
}

public class ThisKeywordDemo {

	public static void main(String[] args) {

		A obj = new A(10);
		obj.show();

	}

}
