package com.qa.vehicles;

public class Van extends Vehicle{

	private int storgageCapacity;

	public int getStorgageCapacity() {
		return storgageCapacity;
	}

	public void setStorgageCapacity(int storgageCapacity) {
		this.storgageCapacity = storgageCapacity;
	}

	public Van(String model, String colour, int noOfWheels, int seatingCapacity, String fuelType,
			int storgageCapacity) {
		super(model, colour, noOfWheels, seatingCapacity, fuelType);
		this.storgageCapacity = storgageCapacity;
	}

	@Override
	public String toString() {
		return "\n Van [" + getColour() + " " + getModel() + " "  + "with capacity for "
				+ getSeatingCapacity() + " people. Fuel Type: " + getFuelType() + " Storgage Capacity: " + getStorgageCapacity()+ " Litres"+ "]";
	}
	
	
	
}
