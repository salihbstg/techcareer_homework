package customer;

public class IndividualCustomer extends Customer{
    private String nameSurname;
    private String email;
    private String phoneNumber;

    public IndividualCustomer(boolean isCustomerCompany, String nameSurname, String email, String phoneNumber) {
        super(isCustomerCompany = false);
        this.nameSurname = nameSurname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" +
                "nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
