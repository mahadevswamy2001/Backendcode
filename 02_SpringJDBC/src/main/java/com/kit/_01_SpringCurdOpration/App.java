package com.kit._01_SpringCurdOpration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {

		System.out.println("Program execution Started-----------!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_01_SpringCurdOpration/Config.xml");
		JdbcTemplate a = (JdbcTemplate) context.getBean("jdbcTemplate");

        String query = "INSERT INTO student1.jdbcspring (Usn, Name, City) VALUES (?, ?, ?)";
        // Insert the first row
        int rowsAffected1 = a.update(query, "4", "Maha", "blr");

//        // Insert the second row
//        int rowsAffected2 = a.update(query, "5", "eshwar", "NY");
//
//        // Insert the third row
//        int rowsAffected3 = a.update(query, "6", "kumar", "SF");
//
//
//		String query = "delete from student1.jdbcspring";
//		int rowsAffected = a.update(query);
//		

		System.out.println("Rows affected: " + rowsAffected1);
		System.out.println("Program execution Ended-----------!");
	}
}
