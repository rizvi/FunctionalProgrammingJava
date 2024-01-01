package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingExample {
	public static void main(String[] args) {
		printNameAndActivities();
		printNameAndActivitiesWithConsumerChaining();
	}

	private static void printNameAndActivitiesWithConsumerChaining() {
		Consumer<Student> c3 = student -> System.out.println(student.getName());
		Consumer<Student> c4 = student -> System.out.println(student.getActivities());
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c3.andThen(c4)); //consumer chaining
	}

	private static void printNameAndActivities() {
		Consumer<Student> c4 = student -> System.out.println(student.getName() +" : "+student.getActivities());
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c4);
	}
}
