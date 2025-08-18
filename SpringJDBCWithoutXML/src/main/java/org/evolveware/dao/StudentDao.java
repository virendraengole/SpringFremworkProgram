package org.evolveware.dao;

import org.evolveware.entity.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student s);
    public int change(Student s);
    public int delete(int id);

    public Student get(int id);

    public List<Student> getAll();

}
