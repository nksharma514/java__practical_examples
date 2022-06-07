package com.example.test.static_keyword;


public class DemoStatic {
	
	static String s = "";
	static {
		System.out.println("print first");
		
		s = "print third";
	}

	public static void main(String[] args) {
		
		System.out.println("The value for s : " + s);		
		
	}
	static {
		System.out.println("print secound");
	}
}