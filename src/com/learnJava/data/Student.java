package com.learnJava.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int gradleLevel;
	private double gpa;
	private String gender;

	public int getGradleLevel() {
		return gradleLevel;
	}

	public double getGpa() {
		return gpa;
	}

	List<String> activities = new ArrayList<>();

	public Student(String name, int gradleLevel, double gpa, String gender, List<String> activities) {
		this.name = name;
		this.gradleLevel = gradleLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	public void setGradleLevel(int gradleLevel) {
		this.gradleLevel = gradleLevel;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gradleLevel='" + gradleLevel + '\'' +
				", gpa='" + gpa + '\'' +
				", gender='" + gender + '\'' +
				", activities=" + activities +
				'}';
	}

}
