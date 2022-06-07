package com.example.test.super_keyword;


class A extends Object {
	public A() {
		super(); // Referring to object class, it is hidden no need to write
		System.out.println("in A const");
	}

	public A(int i) {
		System.out.println("in A const with para");
	}
}

class B extends A {
	public B() {
		super(); // Referring to parent class, it is hidden no need to write all ready present
					// here
		System.out.println("in B const");
	}

	public B(int i) {
		super(i); // Referring to A const with para i when we pass i arguments in super, without
					// this it will show A para by default
		System.out.println("in B const with para");
	}
}




public class SuperAsConstructor {

	public static void main(String[] args) {

		B obj = new B(5);

	}

}
