package com.example.test.inner_classes;

/*
Inner class :- class inside a class is know as Inner class.
1. Member class(non static class)
2. Static class (Nested Class)
3. Anonymous class
4. Lambda class
*/



//1. Member class


public class MemberClassPart1 {

	public static void main(String[] args) {
		
		
		A obj = new A();			// creating this object because of it is a non static class
		obj.i = 5;
		
		System.out.println(obj.i);
		
		
//		for inner class
		
		A.B obj1 = obj.new B();				//A.B means class B inside of class A and obj.new B() if referring the object of class A object.
		obj1.j = 6;
		
		System.out.println(obj1.j);

	}

}

class A {			// class
	
	int i;			// Instance variable of class A, i is the part of A
	
	class B {		// inner class, class inside class
		
		int j;		// Instance variable of class B, j is the part of B, not A
	}
	
	
	
	
	
	
	
	
}