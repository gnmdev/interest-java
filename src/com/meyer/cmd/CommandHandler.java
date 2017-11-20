/*
 * @Author: Grant Meyer
 * @Program: Handles the commands
 * @Version: 1.0.0
 * @Date: 11/19/17
 */




package com.meyer.cmd;
import java.util.*;

public class CommandHandler {

	public void CommandRunner() {
		
		System.out.println("What can we do for you.");
		
		//creates new scanner
		Scanner kbj = new Scanner(System.in); 
				//takes keyboard input from user.
				String uinput = kbj.next();
		
		
		//Makes Commands.java use-able.
		Commands cmd = new Commands(); 
		
		
		if (uinput.charAt(0) == '!') {
			//Loop plays if first letter of message is '!'
			String [] strArgs = uinput.substring(1).split(" ");
			
			if (strArgs[0].equals("help")) { //!HELP COMMAND
				cmd.Help();	
			}
			
			if (strArgs[0].equals("desc")) {
				cmd.Desc();
		}
			
		kbj.close();
		
	
	}
}
}
