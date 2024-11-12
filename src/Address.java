public class Address {

    private String street;
    private String streetNo;
    private int zipCode;

    public Address(String street, String streetNo, int zipCode) {
        this.street = street;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
    }



    public Address() {
        this.street = "none";
        this.streetNo = "none";

    }

    public String getStreet() {
        return street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
