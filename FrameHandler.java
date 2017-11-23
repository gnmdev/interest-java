package com.meyer.frame;

import javax.swing.*;

import com.meyer.main.EquationPicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameHandler {
	
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	

	public void gui() {
		
		// Create Frame
		f = new JFrame("Interest.java");
		f.setVisible(true);
		f.setSize(699, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// Create Panel
		p = new JPanel();
		p.setBackground(Color.blue);
		
		// Add Components
		b1 = new JButton("Go");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EquationPicker ep = new EquationPicker();
						ep.Pick();
				}
			});
		lab = new JLabel("THIS IS  A LABEL");
	
		// Add Components to Panel
		p.add(b1);
		p.add(lab);
		
		// Add Panel into Frame
		f.add(p);
		
		//Good so far
		
		
	}

}
