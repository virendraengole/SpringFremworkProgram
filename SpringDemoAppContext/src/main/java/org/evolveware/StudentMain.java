package org.evolveware;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext ap = new ClassPathXmlApplicationContext("StudentConfig.xml");
        Student s = (Student) ap.getBean("StudentBean");
        System.out.println(s);

    }
}