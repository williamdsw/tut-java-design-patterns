package com.williamdsw.builder.classes;

import com.williamdsw.builder.enums.Transmission;
import com.williamdsw.builder.enums.Type;

public class Car {
	
	// FIELDS
	
	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;
	
	// CONSTRUCTOR

	public Car (Type type, int seats, Engine engine, Transmission transmission, 
			    TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		//this.tripComputer.setCar (this);
		this.gpsNavigator = gpsNavigator;
	}
	
	// GETTERS / SETTERS
	
	public Type getType () {
		return type;
	}
	
	public double getFuel () {
		return fuel;
	}
	
	public void setFuel (double fuel) {
		this.fuel = fuel;
	}
	
	public int getSeats () {
		return seats;
	}
	
	public Engine getEngine () {
		return engine;
	}
	
	public Transmission getTransmission () {
		return transmission;
	}
	
	public TripComputer getTripComputer () {
		return tripComputer;
	}
	
	public GPSNavigator getGpsNavigator () {
		return gpsNavigator;
	}
}
