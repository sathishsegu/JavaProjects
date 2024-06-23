package com.projects.basicprogramapp;

public class RandomNumGen {
	public static void generate(int initial, int finish) {
		int num = (int) (Math.random() * (finish - initial + 1) + initial);
		System.out.println("Random Number in given Range: " + num);
	}
}
