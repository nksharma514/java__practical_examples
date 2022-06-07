package com.example.test.object_count;

//import com.example.test.object_count.Test;

public class CreateObjectWithClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		
		Class c = Class.forName("com.example.test.object_count.Test");		//another way to create object
																			//forName is a static method belongs to class a class
		Test t = (Test)c.newInstance();			// its returning object types, its a generic		
		t.show();
		

	}

}
