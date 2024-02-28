package com.kit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.kit.daoClass.StudentDao;
import com.kit.daoClass.StudentImp;
import com.kit.entityClass.Student;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/student");
        dataSource.setUsername("root");
        dataSource.setPassword("Root");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public StudentDao studentDao(JdbcTemplate jdbcTemplate) {
        StudentImp studentDao = new StudentImp();
        studentDao.setJdbcTemplate1(jdbcTemplate);
        return studentDao;
    }

    @Bean
    public Student student() {
        return new Student();
    }
}
