package com.sapient.exercise.computing_gpa;

public class StudentUtil {

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		// your code
		int noOfStudents = studentIdList.length;
		double[] gpas = new double[noOfStudents];

		double avgGrade = 0.00;

		for (int i = 0; i <= noOfStudents - 1; i++) {
			double sum = 0.00;

			for (int j = 0; j <= studentsGrades[i].length - 1; j++) {

				sum += getGradeMarks(studentsGrades[i][j]);

			}

			avgGrade = sum / studentsGrades[i].length;
			gpas[i] = avgGrade;

		}

		return gpas;
	}

	static int getGradeMarks(char grade) {

		int marks = 0;

		switch (grade) {

		case 'A':
			marks = 4;
			break;

		case 'B':
			marks = 3;
			break;

		case 'C':
			marks = 2;
			break;

		}

		return marks;
	}

	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {

		// perform parameter validation. Return null if passed parameters are not valid

		if (!(higher >= lower && higher >= 0 && lower >= 0)) {

			return null;

		}

		int[] students = null;

		// invoke calculateGPA

		double[] gpas = calculateGPA(studentIdList, studentsGrades);

		// construct the result array and return it. You would need an extra for loop to
		// compute the size of the resulting array

		int size = 0;

		for (int i = 0; i <= gpas.length - 1; i++) {

			if (gpas[i] >= lower && gpas[i] <= higher) {

				size++;

			}

		}

		students = new int[size];

		int counter = 0;
		for (int i = 0; i <= gpas.length - 1; i++) {

			if (gpas[i] >= lower && gpas[i] <= higher) {
				// code here
				students[counter] = studentIdList[i];
				counter++;
			}

		}

		return students;
	}

	public static void main(String[] args) {

		double[] gpa = calculateGPA(new int[] { 1001, 1002, 1003 },
				new char[][] { { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' }, { 'C', 'A', 'B' } });

		System.out.println();

		int[] passed = getStudentsByGPA(3.2, 3.75, new int[] { 1001, 1002, 1003 },
				new char[][] { { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' }, { 'C', 'A', 'B' } });

	//	System.out.println(passed);

		for (double g : gpa) {
			System.out.println("GPA is : " + g);
		}

		for (int p : passed) {
			System.out.println("passed is : " + p);
		}

	}

}