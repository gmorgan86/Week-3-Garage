package com.qa.main;

import com.qa.vehicles.Bus;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Van;

import challenge.garage.Garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car1 = new Car("Mini", "Grey", 4, 4, "Petrol", 3, "Convertible");
		Car car2 = new Car("Mercedes Benz", "Blue", 4, 5, "Diesel", 5, "SUV");
		Car car3 = new Car("Audi", "Red", 4, 5, "Hybrid", 5, "SUV");
		Bus bus1 = new Bus("Volvo", "Yellow", 6, 32, "Electric", "Public Transport");
		Bus bus2 = new Bus("Greyhound", "Black", 6, 27, "Petrol", "School Bus");
		Bus bus3 = new Bus("Boris Bus", "Red", 12, 68, "Bio Bus", "Public Transport");
		Motorbike motorbike1 = new Motorbike("Triumph", "Green", 2, 2, "Petrol", "Cruiser");
		Motorbike motorbike2 = new Motorbike("Suzuki", "Blue", 2, 2, "Electric", "Sport");
		Motorbike motorbike3 = new Motorbike("Mitsubishi", "Black", 2, 2, "Diesel", "Sport");
		Van van1 = new Van("Mitsubishi", "Green", 4, 3, "Diesel", 1500);
		
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(motorbike1);
		garage.addVehicle(motorbike2);
		garage.addVehicle(motorbike3);
		garage.addVehicle(bus1);
		garage.addVehicle(bus2);
		garage.addVehicle(bus3);
		garage.addVehicle(van1);

		System.out.println(garage);

		System.out.println(garage.fixVehicle(car1));
		System.out.println(garage.fixVehicle(car2));
		System.out.println(garage.fixVehicle(car3));
		System.out.println(garage.fixVehicle(bus1));
		System.out.println(garage.fixVehicle(bus2));
		System.out.println(garage.fixVehicle(bus3));
		System.out.println(garage.fixVehicle(motorbike1));
		System.out.println(garage.fixVehicle(motorbike2));
		System.out.println(garage.fixVehicle(motorbike3));
		System.out.println(garage.fixVehicle(van1));
		

		garage.removeVehicleByType("Bus");

		System.out.println(garage);


	}

}
