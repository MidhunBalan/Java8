package com.function;

import java.util.ArrayList;
import java.util.function.Function;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		populate(list);
		Function<Student, String> studentFunction=  student->{
			int marks = student.marks;
			if(marks >= 80) {
				return "A[Distinction]";
			}else if(marks >= 60) {
				return "B[First Class]";
			}
			else if(marks >= 50) {
				return "C[Second Class]";
			}
			else if(marks >= 35) {
				return "D[Third Class]";
			}else {
				return "E[Third Class]";
			}
		};	
		for(Student s: list) {
			System.out.println("Name:"+s.name);
			System.out.println("Marks:"+s.marks);
			System.out.println("Grade:"+studentFunction.apply(s));
			System.out.println("--------------------------------");
		}

	}
	public static void populate(ArrayList<Student> list) {
		list.add(new Student("Midhun", 90));
		list.add(new Student("Nithin", 80));
		list.add(new Student("Nisha", 70));
		list.add(new Student("Sreesha", 100));
		list.add(new Student("Tintu", 50));
		list.add(new Student("Gopi", 60));
		list.add(new Student("Tutu", 30));	
	}

}

class Student{
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name= name;
		this.marks= marks;
	}
}
