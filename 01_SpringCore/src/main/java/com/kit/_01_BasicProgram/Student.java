package com.kit._01_BasicProgram;

public class Student {

	private int usn;
	private String name;
	private double marks;

	public void getUsn() {
		if(usn>10 && usn<90) {
			return;
		}else {
			System.out.println("Enter usn");
		}
	}

	public void setUsn(int usn) {
		System.out.println("Setting usn=======>");
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Name=======>");
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		System.out.println("Setting Marks=======>");
		this.marks = marks;
	}

	public Student() {
		super();
		System.out.println("====>Object will created==>");
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
	}
}
