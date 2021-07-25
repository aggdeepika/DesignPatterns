package ATM.Bank;

public class Address {

    private String streetAdddress;
    private String zipCode;
    private String city;

    public Address() {
    }


    public Address(String streetAdddress, String zipCode, String city) {
        this.streetAdddress = streetAdddress;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreetAdddress() {
        return streetAdddress;
    }

    public Address setStreetAdddress(String streetAdddress) {
        this.streetAdddress = streetAdddress;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }
}
