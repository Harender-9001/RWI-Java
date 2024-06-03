package com.springCore.ci;

public class Address {
    private String City;
    private String State;
    private String Country;

    public Address(String City, String State, String Country) {
        super();
        this.City = City;
        this.State = State;
        this.Country = Country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
