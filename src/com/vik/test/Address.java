package com.vik.test;

import java.util.Optional;

public class Address {

    private String city;

    public Optional getCity() {
        return Optional.ofNullable(city);
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + "]";
    }

}
