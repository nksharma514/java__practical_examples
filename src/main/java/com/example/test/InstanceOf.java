package com.example.test;

class Simple{
	
}
class Simple1 extends Simple{
	
}

public class InstanceOf {

	public static void main(String[] args) {
		
		Simple s = (Simple)new Simple1();
		
		System.out.println(s instanceof Simple);

	}

}
