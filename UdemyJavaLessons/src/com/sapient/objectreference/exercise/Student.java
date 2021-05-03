package com.sapient.objectreference.exercise;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Student(String name) {
		this.setName(name);
	}
}
