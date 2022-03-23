package com.georges.services;

import java.util.*;

public class Service implements PrimeNumberGenerator {

	private int startingValue;
	private int endingValue;
	
	public Service() {
		super();
	}
	
	public List<Integer> generate(int startingValue, int endingValue) {
		List<Integer> result = new ArrayList<Integer>();
		
		// Setting Starting/Ending values
		if (startingValue <= endingValue) {
			this.startingValue = startingValue;
			this.endingValue = endingValue;
		} else {
			this.startingValue = endingValue;
			this.endingValue = startingValue;
		}
		
		// Set iterator
		int i = this.startingValue;
		
		while(i <= this.endingValue) {
			// Run method to check. If true, populate result list.
			if(isPrime(i)) {
				result.add(i);
			}
			
			//iterate
			i++;
		}
	
		// Return result list with all values where isPrime = true;
		return result;
	}

	public boolean isPrime(int value) {
		
		//Return 0 and 1 as prime numbers.
		if (value == 0 || value == 1) {
			return true;
		}
		
		for (int i = 2; i < value ; i++) {
			if (value%i == 0) return false;
		}
		
		return true;
	}

}
