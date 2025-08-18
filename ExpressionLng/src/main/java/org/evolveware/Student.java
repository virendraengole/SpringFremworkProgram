package org.evolveware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {


    @Value("#{100+100+100+100}")
    public int subjectTotal;

   @Value("#{ T(java.lang.Math).sqrt(400)}")
    public double subjectSquare;


   @Value("#{ new java.lang.String ('Virendr')}")
    public String sName;


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjectTotal=" + subjectTotal +
                ", subjectSquare=" + subjectSquare +
                ", sName='" + sName + '\'' +
                '}';
    }

    public int getSubjectTotal() {
        return subjectTotal;
    }

    public void setSubjectTotal(int subjectTotal) {
        this.subjectTotal = subjectTotal;
    }

    public double getSubjectSquare() {
        return subjectSquare;
    }

    public void setSubjectSquare(double subjectSquare) {
        this.subjectSquare = subjectSquare;
    }
}
