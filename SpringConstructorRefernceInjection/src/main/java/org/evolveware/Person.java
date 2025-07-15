package org.evolveware;

public class Person {

    private int PerId;
    private String PerName;

    private Certificate cert;

    public Person(int perId, String perName, Certificate cert) {
        PerId = perId;
        PerName = perName;
        this.cert = cert;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PerId=" + PerId +
                ", PerName='" + PerName + '\'' +
                ", cert=" + cert +
                '}';
    }
}
