package com.georges.views;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertMenuTest {

	InsertMenu insertMenu = new InsertMenu();
	
	@Test
	public void charCheckerTrueTest() {
		String testData = "0123456789-";
		
		for(char i : testData.toCharArray()) {
			assertTrue(insertMenu.charChecker(String.valueOf(i)));
		}
	}
	
	@Test
	public void charCheckerFalseTest() {
		String testData = "qwertyuiopasdfghjklzxcvbnm";
		
		for(char i : testData.toCharArray()) {
			assertFalse(insertMenu.charChecker(String.valueOf(i)));
		}
	}
	
	// Test for acceptable input
	@Test
	public void acceptableInputAcceptableTest() {
		String testData = "0-10";
		assertTrue(insertMenu.acceptableInput(testData));
	}

	// Test for no numbers.
	@Test
	public void acceptableInputNoNumbersTest() {
		String testData = "-";
		assertFalse(insertMenu.acceptableInput(testData));
	}
	
	// Test for multiple -
	@Test
	public void acceptableInputMultipleDashTest() {
		String testData = "0-10-100";
		assertFalse(insertMenu.acceptableInput(testData));
	}
	
	// Test for no -
	@Test
	public void acceptableInputNoDashTest() {
		String testData = "010100";
		assertFalse(insertMenu.acceptableInput(testData));
	}
	
	// Test for number of acceptable range for Integer
	@Test
	public void acceptableInputTrueIntegerTest() {
		String testData = "2147483647-0";
		assertTrue(insertMenu.acceptableInput(testData));
	}
	
	// Test for number too large to fit in Integer
	@Test
	public void acceptableInputFalseIntegerTest() {
		String testData = "2147483648-0";
		assertFalse(insertMenu.acceptableInput(testData));
	}
}
