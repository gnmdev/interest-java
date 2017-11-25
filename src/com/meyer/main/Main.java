/*
 * @Author: Grant Meyer
 * @Program:
 * @Date: 11/18/17
 * @Version 1.0.0
 */

package com.meyer.main;

import com.meyer.cmd.*;
import com.meyer.desc.*;
import com.meyer.frame.FrameHandler;
import javax.swing.JFrame;

import com.meyer.frame.*;

public class Main {
	
	public static void main(String args[]) {

		FrameHandler fr = new FrameHandler();
		fr.Tutorial();
		
	/*		Gui go = new Gui();
			go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			go.setSize(300,200);
			go.setVisible(true);

		
	//	Description d = new Description();
	//		d.Desc();
		
	//	EquationPicker ep = new EquationPicker();
	//		ep.Pick();
			
		//CommandHandler cmd = new CommandHandler(); CURRENTLY BUGGED
			//cmd.CommandRunner();
	*/
	}
}
