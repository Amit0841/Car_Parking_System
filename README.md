
# Car Parking System
Introduction
The Car Parking System is a Java-based application that provides a flexible and extensible solution for managing parking lots. It supports different types of vehicles and allows users to configure the cost strategy for parking based on various factors.

Features
Initialization:

Initialize the parking lot with a specific number of floors and car spaces per floor for each vehicle type.
Vehicle Management:

Add vehicle details to the parking lot, including vehicle type, registration number, color, and other necessary attributes.
Vehicle Removal:

Remove a vehicle from the parking lot based on the registration number or parking slot number.
Availability Check:

Check the availability of vehicle spaces on a specific floor for a given vehicle type.
Configurable Cost Strategy:

Implement a configurable cost strategy for parking, allowing varying costs based on the vehicle type and supporting different currencies.
Classes
ParkingLot:

Manages the parking lot and its functionalities.
Initializes the parking lot with the given number of floors and vehicle spaces per floor for each vehicle type.
Handles vehicle addition, removal, and availability check.
Implements a configurable cost strategy.
Vehicle:

Represents a vehicle with attributes such as vehicle type, registration number, color, and other necessary attributes.
Floor:

Represents a floor in the parking lot with attributes like floor number, capacity for each vehicle type, and vehicle spaces.
VehicleSpace:

Represents a vehicle space with attributes such as space number, availability, vehicle type, and other necessary attributes.
CostStrategy:

Represents the cost strategy for parking.
Allows for varying costs based on the vehicle type and supports different currencies.
Usage
Initialization:

Call the ParkingLot constructor with the desired parameters (total floors, capacity, cost strategy).
Adding Vehicle:

Use the addVehicle method to add a vehicle with the specified type, registration number, and color.
Removing Vehicle:

Call the removeVehicle method with the registration number or parking slot number to remove a vehicle.
Checking Availability:

Use the checkAvailability method with the floor number and vehicle type to check available spaces.
Cost Calculation:

Calculate the parking cost using the calculateCost method with the vehicle type and duration.
