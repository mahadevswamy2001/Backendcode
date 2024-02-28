package com.kit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kit.demo.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, String> {

}
