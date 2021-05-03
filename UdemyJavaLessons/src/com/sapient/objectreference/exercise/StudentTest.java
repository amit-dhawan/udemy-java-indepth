package com.sapient.objectreference.exercise;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Amit");
		Student student2 = new Student("Vickey");
		Student student3 = new Student("Pradeep");

		Student[] students = { student1, student2, student3 };
		int i = 1;

		for (Student s : students) {
			System.out.println("Name of student" + i + " is: " + s.getName());
			i++;
		}

		swap(students, 1, 2);

		i = 1;
		System.out.println(" /-----------------/");
		for (Student s : students) {
			System.out.println("Name of student" + i + " is: " + s.getName());
			i++;
		}
	}

	public static void swap(Student[] s, int firstIndex, int secondIndex) {

		Student temp;
		temp = s[secondIndex];
		s[secondIndex] = s[firstIndex];
		s[firstIndex] = temp;

	}

}
