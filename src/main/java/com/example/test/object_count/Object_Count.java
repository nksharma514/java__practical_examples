package com.example.test.object_count;

public class Object_Count {

	public static void main(String[] args) {
		
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		A obj4 = new A();
		A obj5 = new A();
		
//		Counting How Many Number of Object Created
		
		obj5.counter();			

	}

}

class A{
	
	static int i;		// Making it "class variable" by using static keyword
						// To use only one Space sharing for all 
	
	public A() {		
		
		i++;
	}
		
	public void counter() {
		
		System.out.println(i);
	
	}
}
