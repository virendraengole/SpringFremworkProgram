package org.evolveware.entity;

import org.springframework.beans.factory.annotation.Value;

public class Address {

    @Value("pune")
    private String City;


    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                '}';
    }
}
