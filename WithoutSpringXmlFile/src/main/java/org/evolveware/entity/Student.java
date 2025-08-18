package org.evolveware.entity;

import org.springframework.stereotype.Component;

//@Component(value = "student")
public class Student {


    public Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void study() {
        System.out.println("student reading book....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
