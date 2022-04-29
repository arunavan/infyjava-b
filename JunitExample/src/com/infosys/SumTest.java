package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void testAdd() {
		Sum s=new Sum();
		assertEquals(10,s.add(62, 4));
		
		//fail("Not yet implemented");
	}

}
