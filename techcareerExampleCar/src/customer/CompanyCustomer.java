package customer;

public class CompanyCustomer extends Customer{
    private String companyName;
    private String companyEmail;
    private String companyPhoneNumber;

    public CompanyCustomer(boolean isCustomerCompany, String companyName, String companyEmail, String companyPhoneNumber) {
        super(isCustomerCompany=true);
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    @Override
    public String toString() {
        return "CompanyCustomer{" +
                "companyName='" + companyName + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", companyPhoneNumber='" + companyPhoneNumber + '\'' +
                '}';
    }
}
