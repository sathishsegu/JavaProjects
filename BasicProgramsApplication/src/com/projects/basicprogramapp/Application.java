package com.projects.basicprogramapp;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		ProgramsList.list();

		System.out.println("Choose which program to execute: ");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.println("Enter Limit: ");
			int limit = sc.nextInt();
			Fibonacci.display(limit);
			break;
		case 2:
			System.out.println("Enter a number to check: ");
			int num = sc.nextInt();
			Palindrome.display(num);
			break;
		case 3:
			System.out.println("Enter starting and limit numbers: ");
			int start = sc.nextInt();
			int finish = sc.nextInt();
			PrimeNumbers.display(start, finish);
			break;
		case 4:
			System.out.println("Enter a number to check: ");
			int n = sc.nextInt();
			CheckPrime.check(n);
			break;
		case 5:
			System.out.println("Enter a number to find Factorial: ");
			int number = sc.nextInt();
			Factorial.display(number);
			break;
		case 6:
			System.out.println("Enter start and end range: ");
			int f = sc.nextInt();
			int l = sc.nextInt();
			RandomNumGen.generate(f, l);
			break;
		case 7:
			System.out.println("Enter a character: ");
			char ch = sc.next().charAt(0);
			PrintASCII.print(ch);
			break;
		case 8:
			System.out.println("Enter a number to check: ");
			int aN = sc.nextInt();
			ArmstrongNumberCheck.check(aN);
			break;
		case 9:
			System.out.println("Enter a number to count digits: ");
			int cN = sc.nextInt();
			DigitCount.count(cN);
			break;
		case 10:
			System.out.println("Enter start and end limit numbers: ");
			int sN = sc.nextInt();
			int lN = sc.nextInt();
			EvenNumbers.display(sN, lN);
			break;
		case 11:
			System.out.println("Enter 3 numbers: ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			LargestOfThreeNum.display(n1, n2, n3);
			break;
		case 12:
			System.out.println("Enter start and end limit numbers: ");
			int fN = sc.nextInt();
			int eN = sc.nextInt();
			OddNumbers.display(fN, eN);
			break;
		case 13:
			System.out.println("Enter base and power: ");
			int base = sc.nextInt();
			int power = sc.nextInt();
			PowerOfaNum.display(base, power);
			break;
		case 14:
			System.out.println("Enter start and end limit numbers: ");
			int initial = sc.nextInt();
			int last = sc.nextInt();
			SumOfNumbers.display(initial, last);
			break;
		case 15:
		case 16:
			System.out.println("Enter a and b values: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			Swapping.swap(a, b);
			break;
		case 17:
			PrintAlphabets.print();
			break;
		case 18:
			System.out.println("Enter nth value: ");
			int nth = sc.nextInt();
			NthPrime.check(nth);
			break;
		case 19:
			System.out.println("Enter start and end limit numbers: ");
			int startNum = sc.nextInt();
			int finalNum = sc.nextInt();
			AlternatePrimes.display(startNum, finalNum);
			break;
		default:
			System.out.println("Invalid option entered!..");
		}
		sc.close();
	}
}
