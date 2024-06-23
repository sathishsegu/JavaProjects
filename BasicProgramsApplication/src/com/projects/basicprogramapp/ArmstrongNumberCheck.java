package com.projects.basicprogramapp;

public class ArmstrongNumberCheck {
	public static void check(int num) {
		int sum = 0;
		int digitCount = 0;
		int temp = num;

		while (num != 0) {
			num /= 10;
			digitCount++;
		}

		num = temp;

		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digitCount);
			num /= 10;
		}
		if (sum == temp) {
			System.out.println("Given Number is Armstrong");
		} else {
			System.out.println("Given Number is not a Armstrong");
		}
	}
}
