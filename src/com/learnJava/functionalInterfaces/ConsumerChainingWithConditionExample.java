package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingWithConditionExample {
	static Consumer<Student> c3 = student -> System.out.println(student.getName());
	static Consumer<Student> c4 = student -> System.out.println(student.getActivities());
	public static void main(String[] args) {
		printNameAndActivitiesWithConsumerChaining();
		printNameAndActivitiesWithConsumerChainingWithCondition();
	}

	private static void printNameAndActivitiesWithConsumerChaining() {
		System.out.println("printNameAndActivitiesWithConsumerChaining: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c3.andThen(c4)); //consumer chaining
	}

	private static void printNameAndActivitiesWithConsumerChainingWithCondition() {
		System.out.println("printNameAndActivitiesWithConsumerChainingWithCondition: ");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(student.getGradleLevel() >= 3) {
				c3.andThen(c4).accept(student);
			}
		}); //consumer chaining
	}
}
