package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateAndConsumerExample {
	Predicate<Student> p1 = student -> student.getGradleLevel()>=3;
	Predicate<Student> p2 = student -> student.getGpa()>=3.9;

	BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;
	BiPredicate<Integer, Double> biPredicate2 = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>3.9;

	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name+" : "+activities);
	Consumer<Student> studentConsumer = student -> {
		if(biPredicate.test(student.getGradleLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	Consumer<Student> studentConsumer2 = student -> {
		if(biPredicate2.test(student.getGradleLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> students) {
		System.out.println("gradeLevel>=3 && gpa>=3.9: ");
		students.forEach(studentConsumer);

	}

	public void printNameAndActivities2(List<Student> students) {
		System.out.println("gradeLevel>3 && gpa>3.9: ");
		students.forEach(studentConsumer2);

	}
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		new BiPredicateAndConsumerExample().printNameAndActivities(studentList);
		new BiPredicateAndConsumerExample().printNameAndActivities2(studentList);
	}
}
