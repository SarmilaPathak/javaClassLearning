package coreproject;

import java.util.Scanner;

public class PrimeNum {

	private static Scanner scr;

	public static void main(String[] args) {
		scr = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int n = scr.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is a composite number");
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
