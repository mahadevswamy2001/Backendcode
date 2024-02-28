package com.kit.demo.conroller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kit.demo.entity.Bike;
import com.kit.demo.serviese.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {
	
	
	BikeService bikeServies;

// Constructor injection
	public BikeController(BikeService bikeServies) {
		System.out.println("1");
		this.bikeServies = bikeServies;
	}

	// Create And Store Bike object
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) {
		System.out.println("2");

		return bikeServies.creatbike(bike);
	}

	// Read bike for a Specific bike regNumber
	@GetMapping(value = "/{regNumber}")
	public Bike getBikeByRegNumber(@PathVariable String regNumber) {
		return bikeServies.readBikebyRegNumber(regNumber);
	}

	// Read All the bikes
	@GetMapping
	public List<Bike> getAllBikes() {
		return bikeServies.readAllBike();
	}

	// Update the bike
	@PutMapping
	public Bike updateBike(@RequestBody Bike bike) {
		return bikeServies.updateBike(bike);
	}

	// Delete the Bike
	@DeleteMapping(value = "{regNumber}")
	public String deleteBike(@PathVariable String regNumber) {
		return bikeServies.deliteBikeByRegNumber(regNumber);
	}

}
