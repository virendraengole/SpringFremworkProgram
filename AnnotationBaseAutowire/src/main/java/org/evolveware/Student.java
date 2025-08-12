package org.evolveware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {

    private int sId;
    private String sName;


    //@Autowired
    private Address sAddress;


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Address getsAddress() {
        return sAddress;
    }
    @Autowired
    @Qualifier("address1")
    public void setsAddress(Address sAddress) {
        System.out.println("Setting   values");
        this.sAddress = sAddress;
    }



   // @Autowired
    public Student(Address sAddress) {
        System.out.println("Inside   Constructor");
        this.sAddress = sAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAddress=" + sAddress +
                '}';
    }
}
