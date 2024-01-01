package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> c1= s -> System.out.println(s.toUpperCase());
		c1.accept("java8");
		printStudents();
		printName();
		printDetails();
		printNameAndActivities();
	}

	public static void printName() {
		Consumer<Student> c2 = student -> System.out.println(student);
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2);
	}

	public static void printDetails() {
		Consumer<Student> c3 = student -> System.out.println(student.getName() +" : "+student.getGender());
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c3);
	}

	public static void printNameAndActivities() {
		Consumer<Student> c4 = student -> System.out.println(student.getName() +" : "+student.getActivities());
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c4);
	}
	private static void printStudents() {
		Consumer<Student> c2 =(student -> System.out.println(student.getName()));
		c2.accept(StudentDataBase.getAllStudents().get(0));
		c2.accept(StudentDataBase.getAllStudents().get(1));
		c2.accept(StudentDataBase.getAllStudents().get(2));
		c2.accept(StudentDataBase.getAllStudents().get(3));
		c2.accept(StudentDataBase.getAllStudents().get(4));
		c2.accept(StudentDataBase.getAllStudents().get(5));
	}
}
