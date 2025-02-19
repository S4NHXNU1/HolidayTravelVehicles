package Sanhanut.HolidayTravelVehicles;

public class Salesperson extends Person{
    protected int salespersonID;
    protected double totalSale;

    public Salesperson(String name, String phoneNumber, String address, int salespersonID, double totalSale)
    {
        super(name, phoneNumber, address);
        this.salespersonID = salespersonID;
        this.totalSale = totalSale;
    }
}
