package com.example.test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizableDemo {

	public static void main(String[] args) throws Exception {
		
		
		Demo obj = new Demo();
		obj.i = 5;
		
		File f = new File("save.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);  //Storing Object so we write ObjectOutputStream, if Strong Data then will be DataOutputStream etc.
		oos.writeObject(obj);
		
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo obj1 = (Demo) ois.readObject();
		
		System.out.println("Value of obj1 is " + obj1.i);
		

	}

}
class Demo implements Serializable {		// it's a Marker Interface, Allowing to save Object into the File
	int i;
}