package car;

public abstract class Car {
    private String model;
    private int carAge;
    private String luggCapacity;
    private String fuelType;
    private double dailyRentalFee;

    public abstract double calculateDailyRentalFee(int rentalDay);

    public Car(String model, int carAge, String luggCapacity, String fuelType, double dailyRentalFee) {
        this.model = model;
        this.carAge = carAge;
        this.luggCapacity = luggCapacity;
        this.fuelType = fuelType;
        this.dailyRentalFee = dailyRentalFee;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getLuggCapacity() {
        return luggCapacity;
    }

    public void setLuggCapacity(String luggCapacity) {
        this.luggCapacity = luggCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyRentalFee() {
        return dailyRentalFee;
    }

    public void setDailyRentalFee(double dailyRentalFee) {
        this.dailyRentalFee = dailyRentalFee;
    }
}
