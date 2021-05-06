package com.sapient.java.operators;

public class PrintTwoDimensionalArrayEx {

	public static void main(String[] args) {

		int[][] twoArray = { { 0, 1, 2, 3, 4, 5 }, { 5, 4, 3, 2 } };

		int rows = twoArray.length;
		int collumns = twoArray[0].length;

		System.out.println("Length: " + rows + " Column: " + collumns);
		System.out.println("\n2D array is: \n");
		for (int i = 0; i <= twoArray.length - 1; i++) {
			for (int j = 0; j <= twoArray[i].length - 1; j++) {

				System.out.print(twoArray[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
