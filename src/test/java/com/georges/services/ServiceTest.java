package com.georges.services;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ServiceTest {

	Service service = new Service();
	
	@Test
	public void isPrime0Test() {
		assertTrue(service.isPrime(0));
	}
	
	@Test
	public void isPrime1Test() {
		assertTrue(service.isPrime(1));
	}
}
