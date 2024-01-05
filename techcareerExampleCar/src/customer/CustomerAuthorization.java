package customer;

import car.Car;
import car.Hatchback;

public class CustomerAuthorization {


    public static boolean isCustomerAuthor(Car car, Customer customer){
        if (customer.isCustomerCompany()){
            return true;
        }else {
            return customerIndividual(car);
        }
    }

    private static boolean customerIndividual(Car car){
        return car instanceof Hatchback;
    }
}
