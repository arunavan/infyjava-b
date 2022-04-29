package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest3 {

	@Test
	void testGetObject() {
		
		assertNull(new Loan().getObject());
	}

}
