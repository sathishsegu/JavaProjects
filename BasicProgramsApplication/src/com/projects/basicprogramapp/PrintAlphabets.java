package com.projects.basicprogramapp;

public class PrintAlphabets {
	public static void print() {
		for (int i = 65; i <= 122; i++) {
			if (i >= 91 && i <= 96) {
				continue;
			}
			System.out.println((char) i + " - " + i);
		}
	}
}
