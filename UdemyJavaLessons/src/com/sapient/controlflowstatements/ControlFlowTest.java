package com.sapient.controlflowstatements;

public class ControlFlowTest {

	static int age = 41;
	static double salary = 70000.00;
	static boolean hasBadCredit = false;

	static boolean isLoanApproved() {

		boolean isApproved = false;

		if (25 <= age && age <= 35 && hasBadCredit == false && 30000 <= salary && salary <= 50000) {

			isApproved = true;
		} else if (35 < age && age <= 45 && hasBadCredit == false && 50000 < salary && salary <= 750000) {

			isApproved = true;
		} else {
			isApproved = false;
		}

		return isApproved;

	}

	public static void main(String[] args) {

		boolean approved = isLoanApproved();
		System.out.println("load is approved : " + approved);

	}

}
