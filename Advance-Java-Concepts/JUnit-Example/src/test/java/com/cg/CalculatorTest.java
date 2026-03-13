package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

	static Calculator cal;

//	@BeforeEach
//	public void init() {
//		cal = new Calculator();
//		System.out.println("Calculator Object Created");
//	}
//	
//	@AfterEach
//	public void destroy() {
//		cal = null;
//		System.out.println("Calculator Object Destroyed");
//	}

	@BeforeAll
	static void init() {
		cal = new Calculator();
		System.out.println("Calculator Object Created");
	}

	@AfterAll
	static void destroy() {
		cal = null;
		System.out.println("Calculator Object Destroyed");
	}

	@Test
	@DisplayName(value = "Testing calculate method")
	void calTest() {
		System.out.println("Testing Calculate Method");
		assertEquals(10, cal.calculate(7, 3));

	}

	// @Test
	@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
	// @Disabled
	@ParameterizedTest
	@ValueSource(ints = { 17, 19, 23, 53 })
	void isPrimeTest(int num) {
		System.out.println("Testing isPrime Method");
		assertTrue(cal.isPrime(num));
		assertFalse(cal.isPrime(1));
		assertFalse(cal.isPrime(20));
	}

}
