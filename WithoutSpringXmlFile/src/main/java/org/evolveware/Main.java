package org.evolveware;

import org.evolveware.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(studentConfig.class);
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
        student.getAddress();
        student.study();

    }
}