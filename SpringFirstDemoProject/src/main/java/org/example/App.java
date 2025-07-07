package org.example;

import org.example.POJO.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ContextResource;
import org.springframework.core.io.Resource;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
         Resource resource=new ClassPathResource("StudentConfig.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        //ApplicationContext factory  = new ClassPathXmlApplicationContext("StudentConfig.xml");
        Student s =   (Student) factory.getBean("StudentBean");
        System.out.println(s);
    }
}
