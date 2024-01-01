package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void nameAndActivities() {
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name+": "+activities);
		};
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a,b) -> {
			System.out.println("a: "+a+ " b: "+b);
		};

		biConsumer.accept("Java7", "Java8");

		BiConsumer<Integer, Integer> multiply = (a,b) -> {
			System.out.println("Multiplication of "+a+" and "+b+"= "+ (a*b));
		};
		BiConsumer<Integer, Integer> division = (a,b) -> {
			System.out.println("Division of "+a+" / "+b+"= "+ (a/b));
		};
		multiply.accept(7, 8);

		multiply.andThen(division).accept(10, 5);
		nameAndActivities();
	}

}
