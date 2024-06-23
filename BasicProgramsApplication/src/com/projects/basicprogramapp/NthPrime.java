package com.projects.basicprogramapp;

public class NthPrime {
	public static void check(int n) {
		int count = 0;
		int num = 1;
		int i;
		while (count < n) {
			num += 1;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count++;
			}
		}
		System.out.println(n + "th prime number is " + num);
	}
}
