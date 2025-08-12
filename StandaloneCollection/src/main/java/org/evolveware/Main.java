package org.evolveware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfig.xml");

         Emp emp = context.getBean("emp" ,Emp.class);
        System.out.println(emp);
        Emp emp2 = context.getBean("emp2" ,Emp.class);
        System.out.println(emp2);


    }
}