package com.projects.basicprogramapp;

public class LargestOfThreeNum {
	public static void display(int a, int b, int c) {
		if (a >= b && a >= c) {
			System.out.println(a + " is larger value");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is larger value");
		} else {
			System.out.println(c + " is larger value");
		}
	}
}
