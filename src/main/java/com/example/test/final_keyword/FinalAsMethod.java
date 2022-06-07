package com.example.test.final_keyword;

class A {
	final public void show() { // this is final show method, it will not allow to create another show method
		System.out.println("in A show method");
	}
}

class B extends A {
//	public void show() {		//it will not allow to create the show method becouse of final keyword used in A class show method
//		System.out.println("in B show method");
//	}
}

public class FinalAsMethod {

	public static void main(String[] args) {

		B obj = new B(); // point to class A show method because of final keyword
		obj.show();

	}

}
