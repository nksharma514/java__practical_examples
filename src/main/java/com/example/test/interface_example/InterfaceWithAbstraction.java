package com.example.test.interface_example;

//Creating interface that has 4 methods

interface Letter{
	void a();		//by default, public and abstract
	void b();
	void c();
	void d();
	
//	or, it can also be written like this //by default, public and abstract
	
//	public abstract void a();
//	public void b();
//	abstract void c();
//	void d();
}

//Creating abstract class that provides the implementation of one method of Letter interface

abstract class Text implements Letter{
	public void c() {
		System.out.println("I am C.");
	}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the method

class Book extends Text{
	public void a() {
		System.out.println("I am A.");
	}
	public void b() {
		System.out.println("I am B.");
	}
	public void d() {
		System.out.println("I am D.");
	}
}

//Creating a InterfaceWithAbstraction class that calls the methods of Letter interface

public class InterfaceWithAbstraction {

	public static void main(String[] args) {
		
		
		Letter obj = new Book();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		

	}

}
