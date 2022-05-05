package com.verification.logical;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.infy.test.MobileServiceTest;

@Tag("Testing")
class MobileServiceTestVerification {
	private  MobileServiceTest  mobileServiceTest = new  MobileServiceTest();

    @Test
    void registerRequestInvalidBrandTest()
    {
	assertDoesNotThrow(() ->  mobileServiceTest.registerRequestInvalidBrandTest());
    }

    @Test
    void registerRequestInvalidContactNumberTest()
    {
	assertDoesNotThrow(() ->  mobileServiceTest.registerRequestInvalidContactNumberTest());
    }

    @Test
    void registerRequestInvalidIssuesTest()
    {
	assertDoesNotThrow(() ->  mobileServiceTest.registerRequestInvalidIssuesTest());
    }

   
}
