package com.sapient.java.operators;

public class FindDivisorExample {

	public static void main(String[] args) {

		int x = 24;

		// find divisors of number x
		int count = 0;

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {

				System.out.println(i);
				count++;
			}

		}

		System.out.print("Count of divisors: ");
		System.out.println(count);

	}

}
