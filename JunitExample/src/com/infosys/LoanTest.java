package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testGetEmi() {
		//fail("Not yet implemented");
		
		Loan l=new Loan();
		 double actualResult= l.getEmi(60000.00);
		 double expectedResult=5000.00;
		 assertEquals(expectedResult,actualResult);
	}

}
