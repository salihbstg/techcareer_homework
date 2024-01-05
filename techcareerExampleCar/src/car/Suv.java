package car;

public class Suv extends Car {

    private boolean sunroof;

    public Suv(String model, int carAge, String luggCapacity, String fuelType, double dailyRentalFee, boolean sunroof) {
        super(model, carAge, luggCapacity, fuelType, dailyRentalFee);
        this.sunroof = sunroof;
    }

    @Override
    public double calculateDailyRentalFee(int rentalDay) {
        if (this.sunroof) {
            return (rentalDay * getDailyRentalFee()) + (getDailyRentalFee() * 2);
        }
        return rentalDay * getDailyRentalFee();
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
