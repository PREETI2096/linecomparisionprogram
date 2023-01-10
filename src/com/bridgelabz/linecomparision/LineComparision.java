package com.bridgelabz.linecomparision;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation program!");
		int x1 = 21 , y1 = 16 ;
		int x2 = 18 , y2 = 27;
		
		double length = Math.sqrt(Math.pow(x2- x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line = " + length);
	}
}
