package com.example.test.final_keyword;

final class Abc{
	public void show() {
		System.out.println("in A show method");
	}
}

//class Abc1 extends Abc{		// it will not allow to extends the final class 
//	public void show() {
//		System.out.println("in B show method");
//	}
//}


public class FinalAsClass {

	public static void main(String[] args) {
		
		Abc obj = new Abc();
		obj.show();

	}

}
