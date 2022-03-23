package com.georges.services;

import java.util.*;

public class Service implements PrimeNumberGenerator {

	public Service() {
		super();
	}
	
	public List<Integer> generate(int startingValue, int endingValue) {
		List<Integer> result = new ArrayList<Integer>();
		int i = startingValue;
		
		while(i <= endingValue) { 
			if(isPrime(i)) {
				result.add(i);
			}
		}
	
		return result;
	}

	public boolean isPrime(int value) {
		
		//Return 0 and 1 as prime numbers.
		if (value == 0 || value == 1) {
			return true;
		}
		
		return false;
	}

}
