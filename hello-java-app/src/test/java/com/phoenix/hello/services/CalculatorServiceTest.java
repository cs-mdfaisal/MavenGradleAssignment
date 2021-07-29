package com.phoenix.hello.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.phoenix.math.Calculator;
import com.phoenix.services.CalculatorServices;

public class CalculatorServiceTest {

	private CalculatorServices calciService;
	
	
	@Before
	public void setUp() {
		calciService=new CalculatorServices(new Calculator());
	}
	@Test
	public void testAddition() {
		assertEquals(20, calciService.addition(10, 10));
	}

	@After
	public void clean() {
		calciService=null;
	}

}
