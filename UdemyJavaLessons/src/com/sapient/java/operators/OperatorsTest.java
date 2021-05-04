package com.sapient.java.operators;

public class OperatorsTest {

	public static void main(String[] args) {

		int i = 10;

		// Unary operator - there is only 1 operand

		int j = i++; // assignment happens before the operation
		System.out.println("j:" + j);
		System.out.println("i:" + i);

		int x = ++j; // operation happens before the assignment
		System.out.println("j:" + j);
		System.out.println("x:" + x);

		// Binary operator - there are 2 operands
		System.out.println("i: " + i + " | j:" + j);
		System.out.println("sum of i and j:" + (i + j));

		// tertiary operator - there are 3 operands (?:)
		int c = i >= j ? 100 : 0;
		System.out.println(c);

		// Arithmetic operators + - * / %
		int a = 10;
		int b = 20;

		System.out.println("quotient of b/a:" + b / a);
		System.out.println("remainder of b%a: " + b % a);

		// check if a number is off or even
		int z = 1838838955;
		boolean number;
		number = z !=0 && z % 2 == 0 ? true : false;
		System.out.println(z + " ==>> is even " + number);

	}

}
