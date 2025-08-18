package org.evolveware;


import org.evolveware.dao.StudentDao;
import org.evolveware.dao.StudentDaoImpl;
import org.evolveware.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
       /*JdbcTemplate template  = context.getBean("jdbcTemplate" , JdbcTemplate.class);

        String query = "insert into student(id,name,city) values(?,?,?)";
        Student s = new Student();
        s.setId(3);
        s.setName("gopal");
        s.setCity("nagar");
        int result = template.update(query,s.getId(),s.getName(),s.getCity());
        System.out.println("how many rows effected = "+result);*/

        /*standard Way Insert */
       StudentDao sd  = context.getBean("studentDao" , StudentDao.class);
//        Student s = new Student();
//        s.setId(4);
//        s.setName("gaurav");
//        s.setCity("pune");
//        System.out.println("how many rows effected = "+sd.insert(s));

//         Update
//        Student s1 = new Student();
//        s1.setId(1);
//        s1.setCity("bhosari");
//        s1.setName("viru");
//        System.out.println("how many rows effected = "+sd.change(s1));

//          Delete
//        System.out.println("how many rows effected = "+sd.delete(4));

//          select
        System.out.println("get data = "+sd.get(1));

        System.out.println("get All data = "+sd.getAll());


    }
}
