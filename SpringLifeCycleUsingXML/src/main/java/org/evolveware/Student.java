package org.evolveware;

public class Student {

    private int studentId;
    private String studentName;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Set studentID ");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Set studentName ");
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName) {
        System.out.println("Constructor set studentID And Name ");
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

    public void init() {
        System.out.println("In Init Method");
    }

    public void destroy() {
        System.out.println("In Destroy Method");
    }
}
