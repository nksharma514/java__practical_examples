package com.example.test.exception_handling;

//Creating Own Exception Handling

public class UserDefineException {

	public static void main(String[] args) {

		int i = 5;

		try {
			if (i < 10) {
				throw new MyException("Error...");		//may be written both Exception or MyException
			}
		} catch (MyException e) {			//may be written both Exception or MyException
			System.out.println(e);
		}
	}

}
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);			// for printing message written in throw new MyException.
	}
}