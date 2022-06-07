package com.example.test.collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Collection:- 1. Collection is a Interface and
			 2. ArrayList is a class
			 3. its print data serially, because it has not Index Value so,
			 4. Sorting of date is not possible
			 5. when we want to print a particular index value date, it is not possible in Collection interface
*/


public class CollectionPart1 {

	public static void main(String[] args) {
		
/*		
		int a[] = new int[5];	//Only accepts integer value size is fixed
		a[0] = 4;
		a[1] = 5;
		a[2] = 9;
		a[4] = 1;
		
		Object o[] = new Object[4];		//Accepts Object values(any type) but size is fixed
		o[0] = 21;
		o[1] = "Naren";
		o[2] = 2.2f;
		o[3] = 5.5;
*/		
		
		
		
		Collection c = new ArrayList();			//its accepts object and Size may increase or decrease here because of Collection so it is object types
		
		c.add(1);
		c.add(2);
		c.add(5);
		c.add("Naren");
		c.add(5.5);
		
		c.remove(5);			//for remove
		
/*		Old Technique for loop like for loop
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
*/		
		
//		Enhanced for loop
		for(Object o : c) {					// Accepting Objects here
			System.out.println(o);
		}
		
		
//		Or,
		
		System.out.println(" \n ");

		Collection<Integer> c1 = new ArrayList<>();			//Accepting only a Integer Types because type mention here
		
		c1.add(1);
		c1.add(2);
		c1.add(5);
//		c1.add("Naren");		// Shows error now
//		c1.add(5.5);			// Shows error now
		
		
		
		for(Integer o : c1) {				//Accepting Integer types, // both Integer or int accepts
			System.out.println(o);
		}
				

	}

}
