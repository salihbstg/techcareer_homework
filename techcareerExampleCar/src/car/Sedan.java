package car;

public class Sedan extends Car implements MonthlyRent {

    private int doorsCount;

    public Sedan(String model, int carAge, String luggCapacity, String fuelType, double dailyRentalFee, int doorsCount) {
        super(model, carAge, luggCapacity, fuelType, dailyRentalFee);
        //this.doorsCount = doorsCount;
        if (doorsCount == 4 || doorsCount == 2) {
            this.doorsCount = doorsCount;
        } else {
            System.out.println("Araçlar yanlızca 4 ve 2 kapılı olabilir, varsayılan olarak 0 girildi!!!!");
        }
    }

    @Override
    public double calculateDailyRentalFee(int rentalDay) {
        return (rentalDay * getDailyRentalFee()) + money();
    }

    @Override
    public double calculateMonthlyRentalFee(int rentalMonth) {
        return (rentalMonth * 29) * getDailyRentalFee();
    }

    private int money() {
        if (this.doorsCount == 4) {
            return 200;
        } else if (this.doorsCount == 2) {
            return 100;
        } else {
            return 0;
        }
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }
}
