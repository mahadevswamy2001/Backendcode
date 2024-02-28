// App.java
package com.kit._15_ProgramWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Project execution Started===============>");
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        Student s = (Student) context.getBean("std");
        System.out.println(s);
        s.study();
        System.out.println("Project execution Ended===============>");
    }
}
