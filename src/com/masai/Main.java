package com.masai;


import com.masai.model.ParkingLot;
import com.masai.model.Vehicle;


public class Main {
	
public static void main(String[] args) {
	
		ParkingLot parkingLot = new ParkingLot(1,4);

        parkingLot.addVehicle("Car","car123","Blue");
        parkingLot.addVehicle("Car","car321","Red");
        parkingLot.addVehicle("Car","car421","Green");
        parkingLot.addVehicle("Car","car521","Yellow");
        parkingLot.addVehicle("Car","car821","Blue");
        parkingLot.addVehicle("Car","car921","Red");

        // Remove vehicle
        Vehicle removedVehicle=parkingLot.removeVehicle("car421");
        Vehicle removedVehicle1=parkingLot.removeVehicle("car821");

        // Check availability on a specific floor for a given vehicle type
        boolean isAvailable=parkingLot.checkAvailability(1,"Car");

        // Display results
        System.out.println("Availability on Floor 1 for Car: "+isAvailable);
		
}
}
