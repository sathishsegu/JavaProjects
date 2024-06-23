package com.projects.basicprogramapp;

public class Palindrome {
	public static void display(int num) {
		int temp = num;
		int nNum = 0;
		while (num != 0) {
			int digit = num % 10;
			nNum = nNum * 10 + digit;
			num = num / 10;
		}
		if (nNum == temp) {
			System.out.println("Given Number is Palindrome");
		} else {
			System.out.println("Given Number is non-Palindrome");
		}
	}
}
