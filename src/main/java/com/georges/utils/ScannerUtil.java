package com.georges.utils;

import java.util.Scanner;

public class ScannerUtil {

	static Scanner scanner = new Scanner(System.in);
	
	public static String getStringInput() {
		String input = "";
		
		while (input.isEmpty()) {
			input = scanner.nextLine();
		}
		
		return input;
	}
}
