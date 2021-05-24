package com.qa.firstmavenproject.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import qa.com.firstmavenproject.calculator.Calculator;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		double res = Calculator.add(5, 3);
		assertEquals(8, res);
		assertEquals(6 + 2, res);
		assertNotEquals(10, res);
	}
	
	@Test
	public void subtractTest() {
		double res = Calculator.subract(10, 15);
		assertEquals(-5, res);
		assertEquals(-2 + -3, res);
		assertNotEquals(11, res);
	}
	
	@Test
	public void multiplyTest() {
		double res = Calculator.multiply(2, 5);
		assertEquals(10, res);
		assertEquals(12 - 2, res);
		assertNotEquals(11, res);
	}
	
	@Test
	public void divideTest() {
		double res = Calculator.divide(22, 11);
		assertEquals(2, res);
		assertEquals(10 - 8, res);
		assertNotEquals(12, res);
	}
	
	@Test
	public void modTest() {
		double res = Calculator.mod(20, 12);
		assertEquals(8, res);
		assertEquals(10 - 2, res);
		assertNotEquals(1, res);
	}
	
}
