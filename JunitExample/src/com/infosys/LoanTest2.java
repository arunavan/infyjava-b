package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoanTest2 {

	@Test
	@Tag("dev")
	void testGetEmi() {
		Loan l=new Loan();
		 double actualResult= l.getEmi(60000.00);
		 double expectedResult=5000.00;
		 assertEquals(expectedResult,actualResult);

	}

	@Test
	@Tag("prod")
	void testMsg() {
		Loan l=new Loan();
		assertEquals("welcome InfyUser",l.msg());
		//fail("Not yet implemented");
	}

}
