package org.evolveware;

public class Student {

    private int studentId;
    private String studentName;

    private String studentAdd;

    public Student(int studentId, String studentName, String studentAdd) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAdd = studentAdd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAdd='" + studentAdd + '\'' +
                '}';
    }
}
