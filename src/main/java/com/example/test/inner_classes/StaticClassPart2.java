package com.example.test.inner_classes;

/*
Inner class :- class inside a class is know as Inner class.
1. Member class(non static class)
2. Static class(Nested class)
3. Anonymous class
4. Lambda class
*/



//2. Static class


public class StaticClassPart2 {

	public static void main(String[] args) {
		
		

		Aa.i = 5;					// no need to create object because of it has static instance variable
		
		System.out.println(Aa.i);
		
		
//		for inner class
		
		Aa.Bb obj1 = new Aa.Bb();				//A.B means class B inside of class A and new A.B() because of it is a static class, no need to create object.
		obj1.j = 6;
		
		System.out.println(obj1.j);

	}

}

class Aa {			// class
	
	static int i;			// Instance variable of class A, i is the part of A
	
	static class Bb {		// inner class, class inside class
		
		int j;		// Instance variable of class B, j is the part of B, not A
	}
	
	
	
	
	
	
	
	
}