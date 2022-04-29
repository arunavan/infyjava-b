package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {

	@Test
public	void testValidateVoterAge() throws Exception{
		    int age = -85;
		    VoterValidator voterValidator = new VoterValidator();
	      //  boolean expectedResult = true;
		  //  boolean actualReslt=voterValidator.validateVoterAge(age);
		  //  assertTrue(actualReslt);
		    Exception exception = Assertions.assertThrows(Exception.class, () -> voterValidator.validateVoterAge(age));
		    Assertions.assertEquals("Invalid age", exception.getMessage());
		  //  assertEquals(actualReslt,expectedResult);
	    }
	
	@ParameterizedTest
	@CsvSource(value = {"19, true","20,true","17,false","16,false"})
	public void validateVoterAgeTestParameter(int age, boolean expected) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
	}
	@ParameterizedTest
	@ValueSource(ints = { 19,20,45,78})

	public void validateVoterAgeTestParameter123(int age) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertTrue(actual);
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = { -19,-20,-45,-78})

	public void validateVoterAgeTestParameter1234(int age) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertFalse(actual);
	}
}
