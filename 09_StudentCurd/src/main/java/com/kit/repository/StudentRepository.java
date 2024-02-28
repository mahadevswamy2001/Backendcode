package com.kit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
