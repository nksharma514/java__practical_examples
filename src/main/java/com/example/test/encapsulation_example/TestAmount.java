package com.example.test.encapsulation_example;

public class TestAmount {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
			ac.setAcc_no(123456789);
			ac.setName("Narendra Sharma");
			ac.setEmail("nksharma@gmail.com");
			ac.setPhone("8802987405");
			ac.setAmount(500000f);
			
			System.out.println(ac.getAcc_no()+", "+ac.getName()+", "+ac.getEmail()+", "+ac.getPhone()+", "+ac.getAmount());;

	}

}
