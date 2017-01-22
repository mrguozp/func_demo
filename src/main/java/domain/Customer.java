package domain;

/**
 * Created by Mrguozp on 2017/1/21.
 */
public class Customer {
    private Address address;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
