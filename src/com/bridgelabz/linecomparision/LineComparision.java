package com.bridgelabz.linecomparision;
import java.util.Scanner;
public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation program!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coordinates of first point: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.println("Enter coordinates of second point: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		double length = Math.sqrt(Math.pow((x2- x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of line = " + length);
	}
}
