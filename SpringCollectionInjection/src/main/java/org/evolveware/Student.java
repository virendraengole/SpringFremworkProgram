package org.evolveware;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    private int studentId;
    private String studentName;
    private List<String>  studentAdd;
    private Set studentAdd1;
    private Map studentAdd2;

    public Set getStudentAdd1() {
        return studentAdd1;
    }

    public void setStudentAdd1(Set studentAdd1) {
        this.studentAdd1 = studentAdd1;
    }

    public Map getStudentAdd2() {
        return studentAdd2;
    }

    public void setStudentAdd2(Map studentAdd2) {
        this.studentAdd2 = studentAdd2;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    public List<String> getStudentAdd() {
        return studentAdd;
    }

    public void setStudentAdd(List<String> studentAdd) {
        this.studentAdd = studentAdd;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAdd=" + studentAdd +
                ", studentAdd1=" + studentAdd1 +
                ", studentAdd2=" + studentAdd2 +
                '}';
    }
}
