package com.example.test;




abstract class Bike{
	 Bike() {System.out.println("bike is created");}
	abstract void run();
	 void changeGear() {System.out.println("Gear Chenged");}
}
class Honda extends Bike{
	void run() {System.out.println("Running Safely");}
}



public class AbstractExample {

	public static void main(String[] args) {
		
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
		
	}

}
