package com.example.test.inner_classes;



//4. Lambda Expression of Anonymous class Part 3



public class LambdaExpressionOfPart3 {

	public static void main(String[] args) {
		
		
		Hi obj = () ->	System.out.println("Hello...");		//Lambda Expression used
		
		obj.show();
		
	}

}

@FunctionalInterface			// it is used for only one Method in Interface, if we create two method it will shows error
interface Hi {
	
	public void show();
}
