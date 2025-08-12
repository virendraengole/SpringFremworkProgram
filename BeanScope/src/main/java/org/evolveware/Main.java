package org.evolveware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeConfig.xml");

            /*By Config.xml*/
        Teacher t1 = context.getBean("teacher", Teacher.class);
        System.out.println(t1.hashCode());
        Teacher t2 = context.getBean("teacher", Teacher.class);
        System.out.println(t2.hashCode());
            /*By StereoType @Scope */
        Student s = context.getBean("student", Student.class);
        System.out.println(s.hashCode());

        Student s2 = context.getBean("student", Student.class);
        System.out.println(s2.hashCode());



    }
}