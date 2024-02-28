package com.kit.mainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kit.daoClass.StudentDao;
import com.kit.entityClass.Student;
import com.kit.config.AppConfig;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Program execution Started-----------!");

        // Create the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the necessary beans from the context
        StudentDao studentDao = context.getBean(StudentDao.class);
        Student student = context.getBean(Student.class);

        // Take user input for setting properties
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        student.setFirst_Name(scanner.next());

        // Close the scanner to avoid resource leak
        scanner.close();

        // Insert the student record
        int result = studentDao.insert(student);

        System.out.println("Program execution Ended-----------!");
    }
}