package com.kit._03_Student.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kit._03_StudentEntity.Student;

public class StudentDaoImpCls implements StudentDao {
	private JdbcTemplate jdbcTemplate1;

	
	
	// to get Specific Student data
	public Student getStudent(String Usn) {
		String sql = "select * from student1.jdbcspring where Usn=?";
		RowMapperImp rowMaping = new RowMapperImp();
		
		
		Student student = this.jdbcTemplate1.queryForObject(sql, rowMaping, Usn);

		return student;
	}
	
	

	// To get All the Student data
//	@Override
//	public List<Student> getStudent() {
//		String sql = "select * from student1.jdbcspring ";
//		RowMapperImp r = new RowMapperImp();
	
	
//		List<Student> students = (List<Student>) this.jdbcTemplate1.query(sql, r);
//
//		return students;
//	}

	public JdbcTemplate getJdbcTemplate1() {
		return jdbcTemplate1;
	}

	public void setJdbcTemplate1(JdbcTemplate jdbcTemplate1) {
		this.jdbcTemplate1 = jdbcTemplate1;
	}

}
