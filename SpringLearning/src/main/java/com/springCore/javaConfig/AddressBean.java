package com.springCore.javaConfig;

public class AddressBean {
    private int houseNo;
    private String city;
    private String state;

    public AddressBean() {
        super();
    }

    public AddressBean(int houseNo, String city, String state) {
        super();
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [houseNo: " + houseNo + ", city: " + city + ", state: " + state +"]";
    }

}
