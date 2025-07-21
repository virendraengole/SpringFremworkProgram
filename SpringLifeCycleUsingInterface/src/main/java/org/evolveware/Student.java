package org.evolveware;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {


    private int studentId;
    private String studentName;



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("set StudentID");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("set StudentName");
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName) {
        System.out.println("Constructor set StudentID And Name ");
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("Student Work End ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Student Work Start ");
    }
}
