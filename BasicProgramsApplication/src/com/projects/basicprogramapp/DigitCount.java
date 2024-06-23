package com.projects.basicprogramapp;

public class DigitCount {
	public static void count(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println("Count of digits: " + count);
	}
}
