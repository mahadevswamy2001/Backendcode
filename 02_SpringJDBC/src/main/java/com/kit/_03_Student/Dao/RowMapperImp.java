package com.kit._03_Student.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kit._03_StudentEntity.Student;

public class RowMapperImp implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student s = new Student();
		s.setUsn(rs.getString(1));
		s.setName(rs.getString(2));
		s.setCity(rs.getString(3));

		return s;
	}

}
