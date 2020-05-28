package com.williamdsw.builder.app;

import com.williamdsw.builder.builders.CarBuilder;
import com.williamdsw.builder.builders.CarManualBuilder;
import com.williamdsw.builder.classes.Car;
import com.williamdsw.builder.classes.Director;
import com.williamdsw.builder.classes.Manual;

public class BuilderDemo {
	
	public static void builderDemo () {
		Director director = new Director ();
		
		// CITY CAR
		CarBuilder carBuilder = new CarBuilder ();
		director.buildCityCar (carBuilder);
		Car car = carBuilder.getCar ();
		System.out.printf ("Car built: %s \n", car.getType ());
		
		CarManualBuilder manualBuilder = new CarManualBuilder ();
		director.buildCityCar (manualBuilder);
		Manual manual = manualBuilder.getManual ();
		System.out.printf ("Car manual built: \n%s \n", manual.print ());
	}
}
