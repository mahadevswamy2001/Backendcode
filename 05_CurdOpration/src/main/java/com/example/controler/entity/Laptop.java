package com.example.controler.entity;

public class Laptop {
	String SerialNumber;
	String Manufacturer;
	double Cost;

	public Laptop(String serialNumber, String manufacturer, double cost) {
		super();
		SerialNumber = serialNumber;
		Manufacturer = manufacturer;
		Cost = cost;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [SerialNumber=" + SerialNumber + ", Manufacturer=" + Manufacturer + ", Cost=" + Cost + "]";
	}

}
