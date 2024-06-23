package com.projects.basicprogramapp;

public class SumOfNumbers {
	public static void display(int initial, int finish) {
		int sum = 0;
		for (int i = initial; i <= finish; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers in given range: " + sum);
	}
}
