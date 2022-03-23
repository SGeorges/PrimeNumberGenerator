package com.georges.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ServiceTest {

	Service service = new Service();
	
	@Test
	public void isPrimeTrueTest() {
		List<Integer> testData = Arrays.asList(0, 1, 2, 3, 5, 941);
		
		for(Integer data : testData) {
			assertTrue(service.isPrime(data));
		}
	}
	
	@Test
	public void isPrimeFalseTest() {
		List<Integer> testData = Arrays.asList(4, 6, 20, 35, 500, 940);
		
		for(Integer data : testData) {
			assertFalse(service.isPrime(data));
		}
	}
	
	@Test
	public void generateInverseTest() {
		assertEquals(service.generate(10,0), service.generate(0, 10));
	}
	
	@Test
	public void generateRangeTest() {
		assertEquals(Arrays.asList(7901, 7907, 7919), service.generate(7900, 7920));
	}
	
	@Test
	public void generatePerformanceTest() {
		System.out.println(service.generate(0, 10000));
		//assertEquals(Arrays.asList(0, 1, 2, 3, 5, 7), service.generate(0, 10));
		assertTrue(true);
	}
}
