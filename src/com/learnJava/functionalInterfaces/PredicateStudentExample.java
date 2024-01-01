package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
	static Predicate<Student> p1 = student -> student.getGradleLevel() >=3;

	public static void filterStudentsByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void main(String[] args) {
		filterStudentsByGradeLevel();
	}
}
