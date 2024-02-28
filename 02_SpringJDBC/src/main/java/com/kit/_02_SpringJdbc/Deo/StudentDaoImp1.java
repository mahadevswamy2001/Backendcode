package com.kit._02_SpringJdbc.Deo;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kit._02_SpringJdbc.Entity.Student;

public class StudentDaoImp1 implements StudentDao {

	private JdbcTemplate jdbcTemplate1;

	public int insert(Student studnet) {
		String inquery = "insert into student1.jdbcspring values(?,?,?)";
		int result = jdbcTemplate1.update(inquery, studnet.getUsn(), studnet.getName(), studnet.getCity());

//		String deleteQuery = "delete from student1.jdbcspring ";
//		int result = jdbcTemplate1.update(deleteQuery);

		System.out.println("Record inserted.........!! " + result);
		return result;
	}

	public JdbcTemplate getJdbcTemplate1() {
		return jdbcTemplate1;
	}

	public void setJdbcTemplate1(JdbcTemplate jdbcTemplate1) {
		this.jdbcTemplate1 = jdbcTemplate1;
	}
}
