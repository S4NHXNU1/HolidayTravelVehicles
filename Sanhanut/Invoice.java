package Sanhanut.HolidayTravelVehicles;

public class Invoice {
    protected int invoiceNumber;
    protected Customer customerInfo;
    protected Salesperson salespersonInfo;
    protected Vehicle vehicleInfo;
    protected DealerInstalledOption dealerInstalledOption;
    protected double finalPrice;

    public Invoice(int invoiceNumber, Customer customerInfo, Salesperson salespersonInfo, 
    Vehicle vehicleInfo, DealerInstalledOption dealerInstalledOption, double finalPrice)
    {
        this.invoiceNumber = invoiceNumber;
        this.customerInfo = customerInfo;
        this.salespersonInfo = salespersonInfo;
        this.vehicleInfo = vehicleInfo;
        this. dealerInstalledOption = dealerInstalledOption;
        this.finalPrice = finalPrice;
    }
}
