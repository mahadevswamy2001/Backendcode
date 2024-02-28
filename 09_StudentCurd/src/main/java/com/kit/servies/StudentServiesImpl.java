package com.kit.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Importing Service annotation

import com.kit.entity.Student;
import com.kit.repository.StudentRepository;

@Service // Add Service annotation to indicate that this class is a service component
public class StudentServiesImpl implements StudentServies {
    @Autowired
    private StudentRepository repo; 
    
    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
