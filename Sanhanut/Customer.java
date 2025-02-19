package Sanhanut.HolidayTravelVehicles;

public class Customer extends Person{
    protected int customerID;

    public Customer(String name, String phoneNumber, String address, int customerID)
    {
        super(name, phoneNumber, address);
        this.customerID = customerID;
    }
}
