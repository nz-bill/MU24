public class Address {

    private String street;
    private String steetNo;

    private String city;

    public Address(String street, String steetNo, String city) {
        this.street = street;
        this.steetNo = steetNo;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", steetNo='" + steetNo + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
