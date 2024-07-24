package com.jdc.demo;

// Truck Car IS A Car
public class TruckCar extends Car {
	
	{
		System.out.println("Init Block of Truck Car");
	}
	
	public TruckCar() {
		super("Truck Car");
		System.out.println("Default Constructor of Truck Car");
	}
	
	public void loading() {
		System.out.println("Truck Car is loading");
	}
}
