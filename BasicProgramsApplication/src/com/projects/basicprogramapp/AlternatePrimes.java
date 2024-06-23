package com.projects.basicprogramapp;

public class AlternatePrimes {
	public static void display(int initial, int finish) {
		boolean alternate = true;
		for (int i = initial; i <= finish; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				if (alternate) {
					System.out.print(i + " ");
				}
				alternate = !alternate;
			}
		}
	}
}
