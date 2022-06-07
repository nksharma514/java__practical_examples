package com.example.test.collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListPart3 {

	public static void main(String[] args) {
		
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,47));
		studs.add(new Student(2,32));
		studs.add(new Student(3,65));
		studs.add(new Student(4,51));
		studs.add(new Student(5,93));
		
		
		System.out.println("All Marks and Roll No in Sequence");
		
		for(Student s : studs) {
			System.out.println(s);
		}
		
		
		System.out.println("All Marks in Decending Order");
		
		Collections.sort(studs,(s1,s2) ->{			// Lambda Expression
			
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;		//Ternary Operator	
			
		});
		
		for(Student s : studs) {
			System.out.println(s);
		}
		

	}

}

class Student{
	
	int rollNo;
	float marks;
	
	
	public Student(int rollNo, float marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
	
}


