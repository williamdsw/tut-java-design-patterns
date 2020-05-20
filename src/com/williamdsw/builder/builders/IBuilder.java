package com.williamdsw.builder.builders;

import com.williamdsw.builder.classes.Engine;
import com.williamdsw.builder.classes.GPSNavigator;
import com.williamdsw.builder.classes.TripComputer;
import com.williamdsw.builder.enums.Transmission;
import com.williamdsw.builder.enums.Type;

public interface IBuilder {
	
	public void setType (Type type);
	public void setSeats (int seats);
	public void setEngine (Engine engine);
	public void setTransmission (Transmission transmission);
	public void setTripComputer (TripComputer tripComputer);
	public void setGPSNavigator (GPSNavigator gpsNavigator);
	
}
