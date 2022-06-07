package com.example.test.wrapper_classes;

import java.util.ArrayList;

//byte,short,boolean,int,char,float,double,long 			all are primitive data types

//Byte,Short,Boolean,Integer,Character,Float,Double,Long		all are wrapper class used in java or for wrapping

public class WrapperDemo {

	public static void main(String[] args) {

		int i = 5;							// it is primitive data types, not purely OOPs
		Integer iObj = new Integer(i); 		// Boxing,Wrapping, Now iObj referring int i value
											// Putting int value into object is called Wrapper
		
		int j = iObj.intValue(); 			// Unboxing, Unwrapping
											// Taking out the value form object is called unwrapper
		System.out.println(j);
		
		
//		Wrapper used in Collection and Generic	
		
//		example
		
//		ArrayList<Integer> value = new ArrayList<Integer>();
//		value.add(10);
//		value.add(20);
		
		
//		or,
		

		Integer jObj = i; 				// AutoBoxing
		Integer k = jObj; 				// AutoUnboxing

		System.out.println(k);

	}

}
