package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two numbers:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = sum(a, b);
			int subtract = subtract(a, b);
			int multiply = multiply(a, b);
			int divide = divide(a, b);
			
			System.out.println("The sum is: " + sum);
			System.out.println("The difference is: " + subtract);
			System.out.println("The product is: " + multiply);
			System.out.println("The quotient is: " + divide);
		}
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }

	
	}
