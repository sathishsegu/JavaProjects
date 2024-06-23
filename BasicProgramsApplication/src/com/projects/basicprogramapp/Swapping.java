package com.projects.basicprogramapp;

public class Swapping {
	public static void swap(int a, int b) {
		System.out.println("Before swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
