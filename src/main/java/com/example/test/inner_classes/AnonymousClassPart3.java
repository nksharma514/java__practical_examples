package com.example.test.inner_classes;


/*
Inner class :- class inside a class is know as Inner class.
1. Member class(non static class)
2. Static class (Nested Class)
3. Anonymous class
4. Lambda class
*/


//3. Anonymous class


public class AnonymousClassPart3 {

	public static void main(String[] args) {
		
		
		Abc obj = new Abc() 
		{
			public void show() 			// Overriding the class Abc, this is Anonymous class
			{
				System.out.println("Hello...");
			}
			
		};
		
		obj.show();			//Calling show method, Method overriding
		
		
		
//		Abc obj1 = new Abc1();
//		obj1.show();
//		

	}

}
class Abc{
	
	public void show() {
		System.out.println("Hi...");
	}
}

//class Abc1 extends Abc {			// no need to create and extends the class in Anonymous class, directly can be write in object 
//	
//	public void show() {
//		System.out.println("Hello...");
//	}
//}