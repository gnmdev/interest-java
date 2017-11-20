package com.meyer.main;
import java.util.*;
public class Math {

	double A;
	int P;
	int I;
	double R;
	int t;
	
	Scanner kbj = new Scanner(System.in); //Iniziliazes Scanner
	
	public double getA() {
		return A;
	}
	
	public void setA() {
		System.out.println("What does A equal? ");
		A = kbj.nextDouble();
	}
	
	public int getP() {
		return P;
	}
	public void setP() {
		System.out.println("What does P equal? ");
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
		System.out.println("What does R equal? ");
		R = kbj.nextDouble();
	}
	public int getT() {
		return t;
	}
	public void setT() {
		System.out.println("What does T equal? ");
		this.t = kbj.nextInt();
	}
	
	

	
}
