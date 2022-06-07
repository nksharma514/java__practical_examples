package com.example.test.interface_example;

interface Car{
	void test();
}

interface Honda1 extends Car{
	void show();
}

class TestInheritance implements Honda1{
	public void test() {
		System.out.println("Test method...");
	}
	public void show() {
		System.out.println("show method...");
	}
}


public class InterfaceInheritanceExample {

	public static void main(String[] args) {
		
		TestInheritance obj = new TestInheritance();
		obj.test();
		obj.show();
		
		

	}

}
