package org.evolveware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext ap = new  ClassPathXmlApplicationContext("StudConfig.xml");
        Student s = (Student) ap.getBean("studentBean");
        System.out.println(s);

    }
}