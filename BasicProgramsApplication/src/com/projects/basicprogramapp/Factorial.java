package com.projects.basicprogramapp;

public class Factorial {
	public static void display(int num) {
		int temp = num;
		int fact = 1;
		while (num != 0) {
			fact *= num;
			num--;
		}
		System.out.println("factorial of " + temp + " is: " + fact);
	}
}
