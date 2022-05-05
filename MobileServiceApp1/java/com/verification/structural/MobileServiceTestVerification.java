package com.verification.structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.infy.test.MobileServiceTest;


@Tag("Testing")
class MobileServiceTestVerification {

	    @Test
	    void registerRequestInvalidBrandTest() throws NoSuchMethodException, SecurityException
	    {
		Assertions.assertNotNull(MobileServiceTest.class.getDeclaredMethod("registerRequestInvalidBrandTest")
							       .getDeclaredAnnotation(Test.class));
	    }
	    @Test
	    void registerRequestInvalidContactNumberTest() throws NoSuchMethodException, SecurityException
	    {
		Assertions.assertNotNull(MobileServiceTest.class.getDeclaredMethod("registerRequestInvalidContactNumberTest")
							       .getDeclaredAnnotation(Test.class));
	    }
	    @Test
	    void registerRequestInvalidIssuesTest() throws NoSuchMethodException, SecurityException
	    {
		Assertions.assertNotNull(MobileServiceTest.class.getDeclaredMethod("registerRequestInvalidIssuesTest")
							       .getDeclaredAnnotation(Test.class));
	    }
}
