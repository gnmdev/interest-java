/*
 * @Author: Grant Meyer
 * @Program: Picks what equation to run based on user input
 * @Version: 1.0.0
 * @Date: 11/19/17
 */



package com.meyer.main;
import java.util.*;
public class EquationPicker {

	public void Pick() {
		
		//Ask user what they woud like to do
		System.out.println(
				
				"[1] Would you like to solve for the total? \n" +
		
				"[2] Would you like to solve for the Principal?"
				
				);
		
		//Create Scanner
			Scanner kbj = new Scanner(System.in);
		//Take keyboard input
			int input = kbj.nextInt();
			
		//Makes Equations.java useable.
		Equations e = new Equations();
			
		//Loop decides what to pick based on input
			if (input == 1) {
				e.EquationTotal();				
			}
			if (input == 2) {
				e.EquationPrincipal();
			}
	
		//Closes Scanner
		kbj.close();
			
	}
	
}
