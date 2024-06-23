package com.projects.basicprogramapp;

public class SwappingWithoutTemp {
	public static void swap(int a, int b) {
		System.out.println("Before swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
