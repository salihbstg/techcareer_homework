package car;

public class Hatchback extends Car implements MonthlyRent {
    public Hatchback(String model, int carAge, String luggCapacity, String fuelType, double dailyRentalFee) {
        super(model, carAge, luggCapacity, fuelType, dailyRentalFee);
    }

    @Override
    public double calculateDailyRentalFee(int rentalDay) {
        return rentalDay * getDailyRentalFee();
    }

    @Override
    public double calculateMonthlyRentalFee(int rentalMonth) {
        return (rentalMonth * 29) * getDailyRentalFee();
    }
}
