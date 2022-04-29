package com.infosys;
public class VoterValidator {
	
	public boolean validateVoterAge(int age) throws Exception {
		if(age<0)
			throw new Exception("Invalid age");
		if(age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
}
//We will be learning the creation of JUnit test cases using the above-given method. It accepts an integer value, age. If the age is less than 0, the method throws an exception with t