package com.projects.basicprogramapp;

public class EvenNumbers {
	public static void display(int initial, int finish) {
		System.out.println("Even Numbers in given Range: ");
		for (int i = initial; i <= finish; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
