package org.example.POJO;

public class Student {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
