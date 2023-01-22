package com.practice.compare;

public class Student {

	private String name;

	private String teacherName;

	private int gradeLevel;

	private Marks marks;

	public Student(String name, String teacherName, int gradeLevel) {
		this.name = name;
		this.teacherName = teacherName;
		this.gradeLevel = gradeLevel;
	}

	public void setMarks(int science, int math, int social, int language1, int language2) {

		this.marks = new Marks(science, math, social, language1, language2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public Marks getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		result.append("Name = " + this.name + " TeacherName = " + this.teacherName + " GradeLevel = " + this.gradeLevel
				+ " Total Marks = " + this.getMarks().getTotal());
		return result.toString();
	}

}
