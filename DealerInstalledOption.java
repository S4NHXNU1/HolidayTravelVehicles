package Sanhanut.HolidayTravelVehicles;

public class DealerInstalledOption {
    protected int optionCode;
    protected String description;
    protected double price;

    public DealerInstalledOption(int optionCode, String description, double price)
    {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
}
