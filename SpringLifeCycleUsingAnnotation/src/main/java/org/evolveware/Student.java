package org.evolveware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

    private int StudentId;
    private String StudentName;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }

     @PostConstruct
        public void init(){
         System.out.println("In Init");
     }

    @PreDestroy
    public void destroy() {
         System.out.println("In Destroy");
     }
}
