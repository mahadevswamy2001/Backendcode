package com.example.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controler.entity.Laptop;

@RestController
@RequestMapping("/laptop")

public class LaptopControler {
	Laptop laptop = new Laptop();

	@GetMapping(value = "{serialNumber}")
	public Laptop readLaptop(@PathVariable String serialNumber) {
	//Laptop l = new Laptop(serialNumber, "DELL", 123.45);
		return laptop;
	}

	@PostMapping()
	public String createLaptop(@RequestBody Laptop laptop) {
		this.laptop = laptop;
		return "Laptop Created Successfully";
	}

	@PutMapping()
	public String updateLaptop(@RequestBody Laptop laptop) {
		this.laptop = laptop;
		return "Data Updated Sucessfully";
	}

	@DeleteMapping(value = "{serialNumber}")
	public String deletLaptop(@PathVariable String serialNumber) {
		laptop = null;
		return "Laptop deleted Sucessfully";

	}
}
