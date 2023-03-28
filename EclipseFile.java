package com.calculator;

import junit.framework.*;
import org.junit.Test;

public class TestCalculator {
	
	@Test
	public void testSum() {
		
		Calculator test = new Calculator();
		int result = test.sum(10, 20);
		Assert.assertEquals(30, result);

   }
	
	 @Test
	 public void testsub() {
	 	Calculator test = new Calculator();
	 	int result = test.subtract(2, 2);
	 	Assert.assertEquals(0, result);
	 }

	  @Test
	 	public void testmul() {
	 		Calculator test = new Calculator();
	 		int result = test.multiply(2, 2);
	 		Assert.assertEquals(4, result);
	 	}
	  @Test
	 	public void testDivide() {
	 		Calculator Calculator = new Calculator();
	 		Assert.assertEquals(2, Calculator.divide(6, 3));
	 	}
	 }

