package org.evolveware.dao;

import org.evolveware.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student s = new Student();
        s.setId(rs.getInt(1));
        s.setName(rs.getString(2));
        s.setCity(rs.getString(3));
        return s;
    }
}
