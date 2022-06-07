package com.example.test.interface_example;

//Marker Interface:- Marker inteface is a interface which has blank interface means there is no any declare methods

interface P {

}

class Abc implements P {

	public void show() {
		System.out.println("in show");
	}
}

public class MarkerInterfaceDemo {

	public static void main(String[] args) {

		Abc obj = new Abc();
		if (obj instanceof P) {
			obj.show();
		} else {
			System.out.println("No P");
		}

	}

}
