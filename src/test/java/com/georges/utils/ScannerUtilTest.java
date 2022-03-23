package com.georges.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;
import org.mockito.Mockito;

public class ScannerUtilTest {

	ScannerUtil scanner = new ScannerUtil();
	
	@Test
	public void ScannerTest() {
		ByteArrayInputStream in = new ByteArrayInputStream("TEST".getBytes());
		System.setIn(in);
		
		assertEquals("TRUE", scanner.getStringInput());
	}
	
}
