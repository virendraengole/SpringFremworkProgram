package org.evolveware;

import org.evolveware.entity.Address;
import org.evolveware.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(value = "org.evolveware.entity")
public class studentConfig {

    @Bean(value="address")
    public Address getAddress() {
        return new Address();
    }

    @Bean(value = "student")
    public Student getStudent() {
        Student s = new Student();
        s.setAddress(getAddress());
        return s;
    }

}
