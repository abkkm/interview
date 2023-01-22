package com.practice.compare;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) {
		Student s1 = new Student("abc","aya",4);
		Student s2 = new Student("xyz","aya",4);
		Student s3 = new Student("def","aya",4);
		Student s4 = new Student("vgp","aya",4);
		Student s5 = new Student("pem","aya",4);
		
		s1.setMarks(90, 100, 100, 100, 100);
		s2.setMarks(100, 100, 100, 90, 100);
		s3.setMarks(100, 100, 80, 100, 100);
		s4.setMarks(100, 100, 90, 100, 100);
		s5.setMarks(100, 100, 100, 99, 100);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		studentList.sort(new StudentComparator());
		
		for(Student s: studentList) {
			System.out.println(s.toString());
			
		}
		
		
		
	}

}
