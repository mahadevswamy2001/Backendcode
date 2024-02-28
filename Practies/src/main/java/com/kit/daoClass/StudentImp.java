package com.kit.daoClass;

import org.springframework.jdbc.core.JdbcTemplate;
import com.kit.entityClass.Student;

public class StudentImp implements StudentDao {
    private JdbcTemplate jdbcTemplate1;

    public int insert(Student student) {
        String query = "INSERT INTO kanakpura.student (first_name) VALUES (?)";
        int result = jdbcTemplate1.update(query, student.getFirst_Name());

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
