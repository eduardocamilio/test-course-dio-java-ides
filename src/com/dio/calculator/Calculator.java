package com.dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Type a number: ");
		a = scan.nextInt();
		System.out.println("Type other number: ");
		b = scan.nextInt();
		
		int sum = sum(a,b);
		int substraction = substraction(a,b);
		float division = division(a,b);
		int multiplication = multiplication(a,b);
		
		System.out.println("sum " + sum);
		System.out.println("sub " + substraction);
		System.out.println("div " + division);
		System.out.println("mult " + multiplication);
	}

	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int substraction(int a, int b) {
		return a - b;
	}
	public static int division(int a, int b) {
		return a / b;
	}
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
}
