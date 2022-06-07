package com.example.test.factorial;

public class FactorialCalculator {
	
	void fact(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		
		System.out.println("factorial is = " + fact);
	}
	
	public static void main(String args[]) {
		
		new FactorialCalculator().fact(5);			//Rule1:- calling method with anonymous object  
		
		FactorialCalculator f1 = new FactorialCalculator();		//Rule2:- calling method with Creating object  
		f1.fact(5);
	}

}
