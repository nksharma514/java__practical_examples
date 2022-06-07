package com.example.test.static_keyword;

public class Static {

	public static void main(String[] args) {
		
//		Abc obj=new Abc();
		
		Abc.show();
		Abc.i=5;
		System.out.println(Abc.i);
		
	}

}

class Abc{
	
	static int i;
	
	public static void show() {
		System.out.println("in show method");
		
	}

}