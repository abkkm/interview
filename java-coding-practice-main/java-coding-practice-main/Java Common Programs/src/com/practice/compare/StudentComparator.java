package com.practice.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		
		if( o1.getMarks().getTotal() == o2.getMarks().getTotal()) {
			return 0;
		}
		if( o1.getMarks().getTotal() < o2.getMarks().getTotal()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}


}
