package org.evolveware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext context = new  ClassPathXmlApplicationContext("StudentConfig.xml");
        Student student  = (Student) context.getBean("StudBean");
        System.out.println(student);


    }
}