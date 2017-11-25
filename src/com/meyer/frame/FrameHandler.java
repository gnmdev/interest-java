package com.meyer.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.meyer.main.Math;

public class FrameHandler extends JFrame
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JTextField A = new JTextField(5);
    JTextField P = new JTextField(5);
    JTextField I = new JTextField(5);
    JTextField R = new JTextField(5);
    JTextField t = new JTextField(5);
    JButton jb = new JButton("Enter");

    public void Tutorial()
    {
        setTitle("Tutorial");
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // add jtextfield onto jpanel
        jp.add(A);
       

        P.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
			{
				//double x = P.getI
			//	jl.setText(P);
			}   
        });
        
        t.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
			{
				String input = jt.getText();
				jl.setText(input);
			}
        });
       
        R.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
			{
				String input = jt.getText();
				jl.setText(input);
			}   
        });
        
        // adds button to
        jp.add(jb);
        
        			HandlerClass handler = new HandlerClass(); 
        
        			jb.addActionListener(handler);
        
        jp.add(jl);
        add(jp);

    }
    
    public class HandlerClass implements ActionListener{
    		public void actionPerformed(ActionEvent e)
    			{
    				String input = jt.getText();
    				jl.setText(input);
    			}
    		public void click(ActionEvent a)
    		{
    			
    		}

    }
}