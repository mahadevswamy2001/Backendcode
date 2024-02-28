package com.kit.quizeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kit.quizeapp.entity.Quize;

public interface QuizDao extends JpaRepository<Quize, Integer> {

}
