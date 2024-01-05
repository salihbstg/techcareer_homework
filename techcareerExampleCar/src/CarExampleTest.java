import car.Hatchback;
import car.Sedan;
import car.Suv;
import customer.CompanyCustomer;
import customer.Customer;
import customer.CustomerAuthorization;
import customer.IndividualCustomer;

public class CarExampleTest {
    public static void main(String[] args) {
        IndividualCustomer individualCustomer = new IndividualCustomer(false, "Salih Bastuğ"
                , "salihbastug@gmail.com", "05446804026");
        System.out.println("Bireysel Müşteri Test : " + individualCustomer);

        CompanyCustomer companyCustomer = new CompanyCustomer(true, "Salih Bilişim"
                , "bilisimSalih@gmail.com", "02121111111");
        System.out.println("Kurumsal Müşteri Test : " + companyCustomer);

        Suv suv = new Suv("C Kasa", 3, "300", "GASOLINE", 200, true);
        Sedan sedan = new Sedan("A Kasa", 1, "200", "LPG", 250, 2);
        Hatchback hatchback = new Hatchback("B Kasa",10,"400","DIESEL",150);

        double suvFee = suv.calculateDailyRentalFee(10);

        double sedanFee = sedan.calculateDailyRentalFee(12);
        double sedanFee1 = sedan.calculateMonthlyRentalFee(2);

        double hatchbackFee = hatchback.calculateDailyRentalFee(15);
        double hatchbackFee1 = hatchback.calculateMonthlyRentalFee(3);

        boolean individualControl = CustomerAuthorization.isCustomerAuthor(suv,individualCustomer);
        boolean individualControl1 = CustomerAuthorization.isCustomerAuthor(sedan,individualCustomer);
        boolean individualControl2 = CustomerAuthorization.isCustomerAuthor(hatchback,individualCustomer);
        System.out.println("" + individualControl + individualControl1 + individualControl2);

        boolean companyControl = CustomerAuthorization.isCustomerAuthor(suv,companyCustomer);
        boolean companyControl1 = CustomerAuthorization.isCustomerAuthor(sedan,companyCustomer);
        boolean companyControl2 = CustomerAuthorization.isCustomerAuthor(hatchback,companyCustomer);
        System.out.println("" + companyControl + companyControl1 + companyControl2);

    }
}
