package Sanhanut.HolidayTravelVehicles;

public class Vehicle {
    protected String serialNumber;
    protected String name;
    protected String model;
    protected int year;
    protected String manufacturer;
    protected double cost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double cost)
    {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "Vehicel Serial Number: %s, Name: %s, Model: %s, Year: %d, Manufacturer: %s, Cost: %.2f"
        .formatted(serialNumber, name, model, year, manufacturer, cost);
    }
}