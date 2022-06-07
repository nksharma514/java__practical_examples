package com.example.test.lambda_expression_example;

interface Abc {
	public abstract void show(); // it is by default public abstract here, if you don't mention here
}

//class Xyz implements Abc{
//	public void show() {
//		System.out.println("in show method interface");
//	}
//}

public class LambdaExpressionWithInterface {

	public static void main(String[] args) {

//		Xyz obj = new Xyz();
//		obj.show();

		
		
//		or,

		
		
//		Abc obj = new Abc() 
//		{
//			public void show() 
//			{
//				System.out.println("in show with lambda expression 1");
//			}
//		};
//		obj.show();

		
		
		
//		or,

		
		
//		Abc obj = () ->
//					{
//						System.out.println("in show with lambda expression 2");
//					}
//				;
//		obj.show();
		
		
		

//		or,
		
		
		

		Abc obj = () -> System.out.println("in show with lambda expression 2");
		obj.show();

	}

}
