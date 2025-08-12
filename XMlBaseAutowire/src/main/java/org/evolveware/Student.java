package org.evolveware;

public class Student {

    public int sId;
    public String sName;
    public Address sAddress;


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

    public void setsAddress(Address sAddress) {
        this.sAddress = sAddress;
    }

    public Student(int sId, String sName, Address sAddress) {
        this.sId = sId;
        this.sName = sName;
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
