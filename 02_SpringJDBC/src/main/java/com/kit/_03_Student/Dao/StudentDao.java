package com.kit._03_Student.Dao;

import java.util.List;

import com.kit._03_StudentEntity.Student;

public interface StudentDao {
	// Specific Student Details
	 public Student getStudent(String Usn);

	// All Student details
//	public List<Student> getStudent();
}
