package com.example.test.encapsulation_example;

public class EncapsulationExample {

	public static void main(String args[]) {

		Emp obj = new Emp();
		
		obj.setEmpId(5);
		obj.setEmpName("Naren");
		
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpName());
		
		Emp obj1 = new Emp();
		
		obj1.setEmpId(6);
		obj1.setEmpName("Raju");
		
		System.out.println(obj1.getEmpId());
		System.out.println(obj1.getEmpName());

	}

}

class Emp {

	private int empId;
	private String empName;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}
	
	

}
