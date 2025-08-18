package org.evolveware.dao;

import org.evolveware.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    @Override
    public int insert(Student s) {
        String query = "insert into student(id,name,city) values(?,?,?)";
        int result = jdbcTemplate.update(query,s.getId(),s.getName(),s.getCity());

        return result;
    }

    @Override
    public int change(Student s) {
        String query = "update student set name = ? , city = ? where id = ? ";
        int result = jdbcTemplate.update(query,s.getName(),s.getCity(),s.getId());

        return result;
    }

    @Override
    public int delete(int id) {
        String query = "delete from student where id = ?";
        int result = jdbcTemplate.update(query,id);
        return result;
    }

    @Override
    public Student get(int id) {

        String query = " select * from Student where id = ?" ;
        RowMapper<Student> rm = new RowMapperImp();
         Student student =  jdbcTemplate.queryForObject(query,rm,id);

        return student;
    }

    @Override
    public List<Student> getAll() {
        String query = " select * from Student" ;
        RowMapper<Student> rm = new RowMapperImp();
        List<Student> student =  jdbcTemplate.query(query,rm);

        return student;
    }


    public JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
