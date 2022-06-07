package com.example.test.file_handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingDemo {

	public static void main(String[] args) throws Exception {
		
		
		File f = new File("demo.txt");
		
//		To Write
		
//		FileOutputStream fos = new FileOutputStream("demo.txt");	// it may be written like this also
		
		FileOutputStream fos = new FileOutputStream(f);		//Creating File demo.txt
		DataOutputStream dos = new DataOutputStream(fos);	//Storing Data so we write DataOutputStream, if Strong Object then will be ObjectOutputStream etc.
		dos.writeUTF("Hello World");	// Writing data into the File demo.txt
		
//		To Read
		
		FileInputStream fis = new FileInputStream(f);		//Reading File form demo.txt
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();		// Reading data from the File demo.txt
		
		System.out.println(str);

	}

}
