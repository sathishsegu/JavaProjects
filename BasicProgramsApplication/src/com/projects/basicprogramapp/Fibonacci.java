package com.projects.basicprogramapp;

public class Fibonacci {
	public static void display(int limit) {
		System.out.println("Fibonacci in the given limit: ");
		int ft = 0;
		int st = 1;
		System.out.print(ft + " ");
		System.out.print(st + " ");
		int i = 2;
		while (i < limit) {
			int tt = ft + st;
			System.out.print(tt + " ");
			ft = st;
			st = tt;
			++i;
		}
	}
}
