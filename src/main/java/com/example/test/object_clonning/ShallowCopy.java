package com.example.test.object_clonning;


//Three types of Cloning Objects

//1. Shallow 
//2. Deep
//3. Clone


class Abc{
	
	int i;
	int j;
	
	
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	
}

public class ShallowCopy {

	public static void main(String[] args) {
		
		
		Abc obj = new Abc();	
		obj.i = 5;
		obj.j = 5;
		System.out.println(obj);	// 5, 6
		
		
		
		System.out.println("After Shallow Copy");
		
		Abc obj1 = obj;
		System.out.println(obj);	// 5, 6
		System.out.println(obj1);	// 5, 6
		
//		After changing the value of j
		
		System.out.println("After Changing value in Shallow Copy");
		
		obj.j = 8;
		
		System.out.println(obj);	// 5, 6		here j value will also be changed
		System.out.println(obj1);	// 5, 8
		
		
		
		

	}

}


