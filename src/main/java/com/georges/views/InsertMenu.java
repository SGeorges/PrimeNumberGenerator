package com.georges.views;

import com.georges.utils.ScannerUtil;

public class InsertMenu implements View {

	private Integer numOne;
	private Integer numTwo;
	
	private void printInterface() {
		System.out.println();
		System.out.println("Please insert a range of numbers (number1-number2)");
	}
	
	public boolean acceptableInput(String userInput) {

		
		if (userInput.contains("-")) {
			// Initial checker of - location and isEmpty.
			if (userInput.indexOf("-") == 0 || userInput.indexOf("-") == userInput.length() - 1) return false;
			
			// Validate only one "-"
			if (userInput.indexOf("-") != userInput.lastIndexOf("-")) return false;
		
			// Try/Catch for Numbers that are too large to be an integer. 
			try {
				this.numOne = Integer.valueOf(userInput.substring(0, userInput.indexOf("-")));
				this.numTwo = Integer.valueOf(userInput.substring(userInput.indexOf("-")+1));
			} 
			catch (Exception e) {
				charChecker(userInput);
				return false;
			}
			
			return true;
			
		} else return false;
	}
	
	public boolean charChecker(String userInput) {
		String acceptableValues = "1234567890-";
		
		for(char i : userInput.toCharArray()) {
			if (acceptableValues.contains(String.valueOf(i))) {}
				else {
					System.out.println("The following character is not allowed : " + i);
					return false;
				}
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
			System.out.println("Number 1 : " + numOne);
			System.out.println("Number 2 : " + numTwo);
		} else {
			System.out.println("Input unacceptable. Please re-enter.");
			return new InsertMenu();
		}
		
		
		
		// Else return an output and request a new range of numbers.
		return new MainMenu();
	}



}
