package com.vik.test;

import java.util.Optional;

public class Address {

    private String city;
    private int zipCode;

    public Optional getCity() {
        return Optional.ofNullable(city);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Optional getZipCode() {
        return Optional.ofNullable(zipCode);
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", zipCode=" + zipCode + "]";
    }

}
