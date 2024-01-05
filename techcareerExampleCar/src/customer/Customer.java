package customer;

public class Customer {
    private boolean isCustomerCompany;

    public Customer(boolean isCustomerCompany) {
        this.isCustomerCompany = isCustomerCompany;
    }

    public boolean isCustomerCompany() {
        return isCustomerCompany;
    }

    public void setCustomerCompany(boolean customerCompany) {
        isCustomerCompany = customerCompany;
    }
}
