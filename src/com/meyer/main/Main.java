package com.meyer.main;

import com.meyer.cmd.CommandHandler;
import com.meyer.desc.Description;

/*
 * @Author: Grant Meyer
 * @Program: 
 * @Date: 11/18/17
 * @Version 1.0.0
 */

public class Main {
	
	public static void main(String args[]) {
		
		Description d = new Description();
			d.Desc();
		
		EquationPicker ep = new EquationPicker();
			ep.Pick();
			
		//CommandHandler cmd = new CommandHandler(); CURRENTLY BUGGED
			//cmd.CommandRunner();
		
	}
}
