package com.example.test.serialization_of_object_in_XML;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeSerializeXML {

	public static void main(String[] args) {		
		
		try {
		
		XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("Student.xml")));
		
		College c = (College)x.readObject();
		
		List<Student> s = c.getStudent();
		
		
		for(Student value : s) {			
			
			System.out.println(value);
		}
		
		
	
	} catch (FileNotFoundException ex) {
		
		Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
	}
		
		

	}

}
