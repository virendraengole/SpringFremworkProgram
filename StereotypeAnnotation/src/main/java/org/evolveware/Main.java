package org.evolveware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("StereoTypeConfig.xml");

        Student s = context.getBean("student", Student.class);
        System.out.println(s);

    }
}