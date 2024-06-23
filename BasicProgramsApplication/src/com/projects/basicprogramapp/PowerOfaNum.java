package com.projects.basicprogramapp;

public class PowerOfaNum {
	public static void display(int base, int pow) {
		int value = 1;
		int temp = pow;
		while (pow != 0) {
			value *= base;
			pow--;
		}
		System.out.println(base + " power of " + temp + " is: " + value);
	}
}
