package com.example.test.object_clonning;


//Three types of Cloning Objects

//1. Shallow 
//2. Deep
//3. Clone


class Ab implements Cloneable {			// it's a marker interface, used of permission, Allowing to Clone the Object because of security purpose
	
	int i;
	int j;
	
	
	@Override
	public String toString() {
		return "Ab [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}


public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Ab obj = new Ab();		
		obj.i = 5;
		obj.j = 6;
		
		System.out.println(obj);	// 5, 6
		
		
		System.out.println("After Clonning");
		
		Ab obj1 = (Ab)obj.clone();
		
		System.out.println(obj);	// 5, 6
		System.out.println(obj1);	// 5, 6
		
		
//		After changing the value of j
		
		System.out.println("After Changing value in Clone");
		
		obj1.j = 8;
				
		System.out.println(obj);	// 5, 6		
		System.out.println(obj1);	// 5, 8			// looks like shallow copy but internally works like deep copy
		

	}

}
