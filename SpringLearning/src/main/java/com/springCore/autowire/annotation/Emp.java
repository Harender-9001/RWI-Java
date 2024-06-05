package com.springCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address2")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("set address");
    }

    public void setAddress1(Address address) {
        this.address = address;
        System.out.println("set address1");
    }
    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("constructor");
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
