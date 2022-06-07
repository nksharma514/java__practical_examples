package com.example.test.super_keyword;

class Abc {

	int i = 10;

	public void show() {
		System.out.println("in A show method");
	}
}

class Abc1 extends Abc {
	public void show() {
		super.show(); // Referring to Abc show method
		System.out.println("in B show method");

		System.out.println(super.i); // Fetching or referring the int i value of Abc class by using super keyword

	}
}

public class SuperAsObject {

	public static void main(String[] args) {

		Abc1 obj = new Abc1();
		obj.show();

	}

}
