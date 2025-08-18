package org.evolveware;

import org.evolveware.dao.StudentDao;
import org.evolveware.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class jdbcConfig {

    @Bean(name = {"ds"})
    public DriverManagerDataSource getDataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc?useSSL=false");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;
    }

    @Bean(name = {"JdbcTemplate"})
    public JdbcTemplate getJdbcTemplate () {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    @Bean(name = {"studentDao"})
    public StudentDao getStudentDao() {

        StudentDaoImpl s = new StudentDaoImpl();
        s.setJdbcTemplate(getJdbcTemplate());
        return s;
    }

}
