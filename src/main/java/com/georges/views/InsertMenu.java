package com.georges.views;

import com.georges.utils.ScannerUtil;

public class InsertMenu implements View {

	private void printInterface() {
		System.out.println();
		System.out.println("Please insert a range of numbers (number1-number2)");
	}
	
	public boolean acceptableInput(String userInput) {
		int dashIndex; 
		
		if (userInput.contains("-")) {
			// Initial checker of - location and isEmpty.
			if (userInput.indexOf("-") == 0 || userInput.isEmpty()) return false;
			
			// Secondary checker to make sure there's only one "-"
			if (userInput.indexOf("-") == 0 || userInput.isEmpty()) return false;
			
			// Validate only one "-"
			if (userInput.indexOf("-") != userInput.lastIndexOf("-")) return false;
		
			return charChecker(userInput);
			
			
		} else return false;
	}
	
	public boolean charChecker(String userInput) {
		String acceptableValues = "1234567890-";
		
		for(char i : userInput.toCharArray()) {
			if (acceptableValues.contains(String.valueOf(i))) {}
				else return false;
		}
		
		return true;
	}
	
	@Override
	public View run() {
		printInterface();
		
		// This scanner is looking for a single String	 input.
		String userInput = ScannerUtil.getStringInput();
		
		// Add conditional logic to make sure format is proper.
		if (acceptableInput(userInput)) {
			// If conditional logic good perform service
			// Output Service
		} else return new InsertMenu();
		
		
		
		// Else return an output and request a new range of numbers.
		return new MainMenu();
	}



}