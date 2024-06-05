package com.springCore.autowire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setting address");
        this.address = address;
    }

    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("constructor is called");
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
