package com.kit._03_RowMapping;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.kit._03_Student.Dao.StudentDao;
import com.kit._03_Student.Dao.StudentDaoImpCls;

@Configuration
public class Configration {
	
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbcspring");
		dataSource.setUsername("root");
		dataSource.setPassword("Root");

		return dataSource;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());

		return jdbcTemplate;
	}

	@Bean("student1")
	public StudentDao getStudent() {
		StudentDaoImpCls st = new StudentDaoImpCls();
		st.setJdbcTemplate1(getJdbcTemplate());

		return st;
	}
}
