package challenge.garage;

import java.util.ArrayList;

import com.qa.vehicles.Vehicle;

public class Garage {
	
	private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		listOfVehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		listOfVehicles.remove(vehicle);
	}

	public void removeVehicleByType(String type) {
		ArrayList<Vehicle> vehiclesToBeRemoved = new ArrayList<>();
		for (Vehicle vehicle : listOfVehicles) {
			if (vehicle.getClass().getSimpleName().equals(type)) {
				vehiclesToBeRemoved.add(vehicle);
			}
		}
		listOfVehicles.removeAll(vehiclesToBeRemoved);

	}

	public String fixVehicle(Vehicle vehicle) {
		int bill = 0;
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 100;

			}
		 else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
			bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 300;

			}
		 else if (vehicle.getClass().getSimpleName().equals("Bus")) {
			bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 15;

			}
		 else if (vehicle.getClass().getSimpleName().equals("Van")) {
				bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 25;

				}
		 else {
			System.out.println("There are no vehicles to fix.");
		}
		return "Total bill to fix: " + vehicle + " is: £" + bill;
	}



	public void emptyGarage() {
		ArrayList<Vehicle> vehiclesToBeRemoved = new ArrayList<>();
		for (Vehicle vehicle : listOfVehicles) {
			vehiclesToBeRemoved.add(vehicle);
		}
		listOfVehicles.removeAll(vehiclesToBeRemoved);

	}

	@Override
	public String toString() {
		return "\nVehicles in Garage:" + listOfVehicles + "\n";
	}

}
