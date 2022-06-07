package com.example.test.object_count;


class Count{
	
	public static int i = 0;
	
	public Count() {
		
		i++;
		
		System.out.println(i);
		
	}
	
//	public void Counter() {
//		System.out.println(i);
//	}
	
}

public class DemoTest {
	
	public static void main(String args[]) {
		
		
		
		Count obj1 = new Count();
		Count obj2 = new Count();
		Count obj3 = new Count();
		Count obj4 = new Count();
		Count obj5 = new Count();
		
//		obj5.Counter();
		
	}
	

}
