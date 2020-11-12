package edu.smg;

import java.util.Random;
import java.util.Scanner;

public class Z11_1 {
	public static void main(String[] args) {

		int numbers = 120;
		int i = 0;
		int num = 2;
		while (i < numbers) {
			if (isPalindromicPrime(num)) {
				System.out.println(num + " ");
				i++;
			}
			num++;
		}

	}

	public static boolean isPalindromicPrime(int num) {
		boolean isPP = true;
		int reversed = 0;
int copy = num;
		double m = Math.ceil(Math.sqrt(num));
		for (int i = 2; i <= m; i++) {
			if (num % i == 0) {
				isPP = false;
				break;
			}
		}

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
//		System.out.println(reversed);
		if (reversed != copy) {
			isPP = false;
		}
		return isPP;
	}
}