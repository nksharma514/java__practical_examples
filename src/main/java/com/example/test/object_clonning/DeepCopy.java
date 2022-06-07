package com.example.test.object_clonning;


//Three types of Cloning Objects

//1. Shallow 
//2. Deep
//3. Clone


class A{
	
	int i;
	int j;
	
	
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	
	
}

public class DeepCopy {

	public static void main(String[] args) {
		
		
		A obj = new A();	
		obj.i = 5;
		obj.j = 6;
		System.out.println(obj);	// 5, 6
		
		
		
		System.out.println("After Deep Copy");
		
		A obj1 = new A();
		obj1.i = obj.i;
		obj1.j = obj.j;		
		
		
		System.out.println(obj);	// 5, 6
		System.out.println(obj1);	// 5, 6
		
		
//		After changing the value of j
		
		System.out.println("After Changing value in Deep Copy");
		
		obj1.j = 8;
				
		System.out.println(obj);	// 5, 6		
		System.out.println(obj1);	// 5, 8
		
		
		
		
		

	}

}


