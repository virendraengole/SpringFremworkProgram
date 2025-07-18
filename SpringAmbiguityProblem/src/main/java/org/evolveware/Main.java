package org.evolveware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         Student s = (Student)context.getBean("student");
        System.out.println(s);
        System.out.println("Sum : "+s.sum());
    }
}