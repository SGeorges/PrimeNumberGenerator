package com.georges;

import com.georges.views.MainMenu;
import com.georges.views.View;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		View currentView = new MainMenu();
		
		while (currentView != null) {
			currentView = currentView.run();
		}
		
		System.out.println("Program Closed");
	}
}
