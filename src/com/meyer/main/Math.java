package com.meyer.main;
import java.util.*;
public class Math {

	
	int P;
	int I;
	double R;
	int t;
	
	Scanner kbj = new Scanner(System.in); //Iniziliazes Scanner
	
	
	public int getP() {
		return P;
	}
	public void setP() {
		System.out.println("P = ");
		P = kbj.nextInt();
	}
	public int getI() {
		return I;
	}
	public void setI() {
		System.out.println("I =");
		I = kbj.nextInt();
	}
	
	public double getR() {
		return R;
	}
	public void setR() {
		System.out.println("R = ");
		R = kbj.nextDouble();
	}
	public int getT() {
		return t;
	}
	public void setT() {
		System.out.println("T = ");
		this.t = kbj.nextInt();
	}
	
	
	
	
}
