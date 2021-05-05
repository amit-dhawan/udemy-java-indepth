package com.sapient.controlflowstatements;

public class SwitchStatementMonthsTest {

	public static void main(String[] args) {

		String month = "Jan";
		String monthName = "Jan";

		switch (month) {

		case "Jan":
			monthName = "January";
			break;
		
		default:
			monthName = "invalid";
			break;

		}

		System.out.println(month + " = Month is: " + monthName);

	}

}
