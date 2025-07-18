package org.evolveware;

public class Student {

    private int id1;

    private int id2;

    public Student(double id1, double id2) {
        this.id1 = (int)id1;
        this.id2 = (int)id2;
        System.out.println("double constructor ");
    }
    public Student(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
        System.out.println("int constructor ");
    }

    public Student(String id1, String id2) {
        this.id1 = Integer.valueOf(id1);
        this.id2 = Integer.valueOf(id2);
        System.out.println("String constructor ");
    }

    public int sum() {
        return this.id1 + this.id2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id1=" + id1 +
                ", id2=" + id2 +
                '}';
    }
}
