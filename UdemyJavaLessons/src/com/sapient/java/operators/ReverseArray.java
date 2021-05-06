package com.sapient.java.operators;

public class ReverseArray {

	public static void main(String[] args) {

		int[] iArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.print("Array: ");
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}

		// logic to reverse an array
		for (int i = 0, j = iArray.length - 1; i < j; i++, j--) {

			int temp;
			temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;
		}
		
		
		System.out.print("\nReversed Array: ");
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
		
	}

}
