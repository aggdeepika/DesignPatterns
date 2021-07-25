package ATM.Bank;

public class Bank {

    private String bankName;
    private Address location;
    private String bankCode;


    public Bank() {
    }

    public Bank(String bankName, Address location, String bankCode) {
        this.bankName = bankName;
        this.location = location;
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public Bank setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public Address getLocation() {
        return location;
    }

    public Bank setLocation(Address location) {
        this.location = location;
        return this;
    }

    public String getBankCode() {
        return bankCode;
    }

    public Bank setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }


}
