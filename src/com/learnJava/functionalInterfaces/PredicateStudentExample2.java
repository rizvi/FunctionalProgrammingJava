package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample2 {
	static Predicate<Student> p1 = student -> student.getGradleLevel() >=3;
	static Predicate<Student> p2 = student -> student.getGpa() >=3.9;
	static Predicate<Student> p3 = student -> student.getGender().equals("female");

	public static void filterStudentsByGradeLevel() {
		System.out.println("filterStudentsByGradeLevel: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsByGPA() {
		System.out.println("filterStudentsByGPA: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p2.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsByGradeLevelAndGPA() {
		System.out.println("filterStudentsByGradeLevelAndGPA: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void filterStudents() {
		System.out.println("filterStudents: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.and(p2).and(p3).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsOR() {
		System.out.println("filterStudentsOR: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.or(p2).and(p3).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsNegate() {
		System.out.println("filterStudentsNegate: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.and(p3).negate().test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void main(String[] args) {
		filterStudentsByGradeLevel();
		filterStudentsByGPA();
		filterStudentsByGradeLevelAndGPA();
		filterStudents();
		filterStudentsOR();
		filterStudentsNegate();
	}
}
