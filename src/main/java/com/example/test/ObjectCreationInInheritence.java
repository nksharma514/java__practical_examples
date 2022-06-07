package com.example.test;

class A {

	public A() {
		System.out.println(" in A Const ");
	}
	public A(int i) {
		System.out.println(" in A const with para ");
	}
}
class B extends A {
	public B() {
//		super();		//hidden keyword that is super pointing parent class
		System.out.println(" in B const ");
	}
	public B(int i) {
//		super();
		System.out.println(" in B const with para ");
	}
}

public class ObjectCreationInInheritence {

	public static void main(String args[]) {

		A obj = new B(2);

	}

}
