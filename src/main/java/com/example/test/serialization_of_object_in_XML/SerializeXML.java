package com.example.test.serialization_of_object_in_XML;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeXML {
	
	public static void main(String args[]) {
		
		
		try {
		
		Student s1 = new Student();
		s1.setRollNo(101);
		s1.setsName("Naren");
		
		Student s2 = new Student();
		s2.setRollNo(102);
		s2.setsName("Raju");
		
		
		List<Student> st = new ArrayList<>();
		st.add(s1);
		st.add(s2);
		
		College c = new College();
		c.setStudent(st);
		
		
		
		
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Student.xml")));
			
			x.writeObject(c);
			x.close();
			
			System.out.println("File Name with 'Student' has Created Successful");
		
		} catch (FileNotFoundException ex) {
			
			Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		
		
		
		
	}

}
