package org.evolveware;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("StudentConfig.xml");
        Student s = (Student) abstractApplicationContext.getBean("student");
        System.out.println(s);
        abstractApplicationContext.registerShutdownHook();
    }
}