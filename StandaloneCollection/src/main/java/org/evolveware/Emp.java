package org.evolveware;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

    private String name;

    private List Phones;
    private Set address;

    private Map data;

    private Properties salary;


    public Properties getSalary() {
        return salary;
    }

    public void setSalary(Properties salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", Phones=" + Phones +
                ", address=" + address +
                ", data=" + data +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getPhones() {
        return Phones;
    }

    public void setPhones(List phones) {
        Phones = phones;
    }

    public Set getAddress() {
        return address;
    }

    public void setAddress(Set address) {
        this.address = address;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
