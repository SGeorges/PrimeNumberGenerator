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

	@Test
	public void acceptableInputTest() {
		String testData = "-";
		assertFalse(insertMenu.acceptableInput(testData));
	}
}
