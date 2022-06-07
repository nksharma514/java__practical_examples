//Java Program to demonstrate the use of a static method.  

package com.example.test.static_keyword;

public class StaticMethod {

	public static void main(String[] args) {
		
		
		//display without calling change method
		
		Employee s1 = new Employee(11, "Naren");
		Employee s2 = new Employee(22, "Raju");
		
		s1.display();
		s2.display();
		
		
		
		System.out.println("After Calling Change static method");
		
		
		
		Employee.change();		//calling change method  
		
		 //creating objects  
		Employee s3 = new Employee(11, "Naren");
		Employee s4 = new Employee(22, "Raju");
		
		//calling display method  
		
		s3.display();
		s4.display();
		
		
	}

}

class Employee{		// Employee class
	
	int id;				// instance variable
	String name;
	static String company = "IETE";			// static variable
	

// create static method to change static variable(Employee instance variable)
	//static method to change the value of static variable  
	
static void change() {
	
	company = "SDDIET";		// change IETE to SDDIET
	
	}

//constructor to initialize the variable  
Employee(int i, String n){
	id = i;
	name = n;
	
	}

//method to display values  
void display() {
	System.out.println(id + " " + name + " " + company);
}



}









