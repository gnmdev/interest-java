package com.meyer.main;

import com.meyer.desc.Description;
/*
 * @Author: Grant Meyer
 * @Program: Uses variables from Math.java to run equation give interest.
 * @Version: 1.0.0
 */

public class Equations extends Math {

	public void EquationTotal() {
		
	
		
		Math m = new Math();
		
		m.setP();
		m.setR();
		m.setT();
		
		double r = m.getR() / 100;
		
		double P = m.getP();
		double t = m.getT();
		
		double A = P * (1 + r * t);
		
System.out.println("Total Accured Amount (principal + interest): $" + A);	
	}		
	
	public void EquationPrincipal() {
		
		Math m = new Math();
		
			m.setA();
			m.setR();
			m.setT();
		
		double r = m.getR() / 100;
		double A = m.getA();
		double t = m.getT();
		
		double P = A/(1+r*t);
		
		System.out.println("P = " + P);
	}
}


