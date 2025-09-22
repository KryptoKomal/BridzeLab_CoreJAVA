public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double ratePerDay = 1000.0; 

    
    public CarRental() {
        this("Unknown", "Economy", 1);
    }

    
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    public void showDetails() {
        System.out.println(customerName + " rented " + carModel +
                           " for " + rentalDays + " day(s). Total cost: " +
                           calculateTotalCost());
    }
}
