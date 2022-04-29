package com.infosys;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = { "Hello", "Junit" ,"javau","infou"})
	void withValueSource(String word) {
		assertEquals(5,word.length());
	}
}
