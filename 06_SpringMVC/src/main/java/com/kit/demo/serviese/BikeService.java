package com.kit.demo.serviese;

import java.util.List;

import com.kit.demo.entity.Bike;

public interface BikeService {
	
	//It will take request mapping input return the bike object
    // Create And Store Bike object
    Bike creatbike(Bike bike);

    // read a bike for a Specific registration number
    Bike readBikebyRegNumber(String regNString);

    // Read all the bike
    List<Bike> readAllBike();

    // update the All the bike
    Bike updateBike(Bike bike);

    // Delete the bike
    String deliteBikeByRegNumber(String regNString);
}
