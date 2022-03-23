package com.georges.views;

public class MainMenu implements View {

	private void printInterface() {
		System.out.println();
		System.out.println("---------- PRIME NUMBER GENERATOR ----------");
		
		System.out.println("1. Insert a number range");
		System.out.println("0. Exit");
	}
	
	@Override
	public View run() {
		printInterface();
		
		// This scanner is looking for a single integer input.
		int userInput = 0;
		
		switch(userInput) {
			case 0:
				return null;
			case 1:
				return new InsertMenu();
			default:
				return null;
		}
	}
}
