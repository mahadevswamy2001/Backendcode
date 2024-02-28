package com.kit.demo.serviese;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kit.demo.entity.Bike;
import com.kit.demo.repository.BikeRepository;

@Service
public class BikeServiesImpl implements BikeService {

	BikeRepository bikeRepository;

	public BikeServiesImpl(BikeRepository bikeRepository) {
		super();
		this.bikeRepository = bikeRepository;
	}

	@Override
	public Bike creatbike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	public Bike readBikebyRegNumber(String regNumber) {

		return bikeRepository.findById(regNumber).get();
	}

	@Override
	public List<Bike> readAllBike() {

		return bikeRepository.findAll();
	}

	@Override
	public Bike updateBike(Bike bike) {

		return bikeRepository.save(bike);
	}

	@Override
	public String deliteBikeByRegNumber(String regNumber) {
		bikeRepository.deleteById(regNumber);
		return "Bike with " + regNumber + " Has been deleted";
	}

}
