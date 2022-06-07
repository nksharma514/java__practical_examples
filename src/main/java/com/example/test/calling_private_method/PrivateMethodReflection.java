package com.example.test.calling_private_method;

import java.lang.reflect.Method;


//Reflection API	- used for testing private method purpose only

public class PrivateMethodReflection {

	public static void main(String[] args) throws Exception {
		
		
		Class c = Class.forName("com.example.test.calling_private_method.Test");
		
		Test t = (Test) c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);		// null - parameter, here there is no parameter so it's null
		
		m.setAccessible(true);
		
		m.invoke(t, null);		// null-parameter

	}

}
