package com.infy.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.infy.exception.InfyBankException;

@Component
@Aspect  // Aspect, advice, pointcut, joinpoint 
public class LoggingAspect {

	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class); 

	@Before("execution(* com.infy.*.*.*(..))")
	public void before() throws InfyBankException {
		System.out.println(" service method is going to start");
		LOGGER.info("1 Before advice called.");
	}

	@After("execution(* com.infy.*.*.*(..))")
	public void after() throws InfyBankException {
		System.out.println(" service method is completed");
		
		LOGGER.info("2  After advice called.");
	}

	@AfterReturning("execution(* com.infy.*.*.*(..))") //
	public void afterReturning() throws InfyBankException {
		System.out.println(" service method give result");
		
		LOGGER.info("3 After returning advice called.");
	}
	@Around("execution(* com.infy.service.*Impl.*(..))")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		LOGGER.info("Before proceeding part of the Around advice.");
		proceedingJoinPoint.proceed();
		LOGGER.info("After proceeding part of the Around advice.");
	}
	@AfterThrowing(pointcut = "execution(* com.infy.*.*.*(..))", throwing = "exception")
	public void afterThrowing(InfyBankException exception) throws InfyBankException {
		System.out.println(" service method is throwing exception");
		
		LOGGER.error(exception.getMessage(), exception);
	}

}