package com.example.dmeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dmeo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
