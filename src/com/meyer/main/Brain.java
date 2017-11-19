package com.meyer.main;
/*
 * @Author: Grant Meyer
 * @Program: Uses variables from Math.java to run equation give interest.
 * @Version: 1.0.0
 */

public class Brain extends Math {

	public void Equation() {
		
		Math m = new Math();
		
		m.setP();
		m.setR();
		m.setT();
		
		double r = m.getR() / 100;
		
		double P = m.getP();
		double t = m.getT();
		
		double x = P * (1 + r * t);
		
System.out.println(x);	
	}		
	
}


