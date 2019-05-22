package com.springjdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2019/5/21.
 */
public class StudentMapper implements RowMapper<Student>{
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setName(resultSet.getString("name"));
        student.setAge(resultSet.getInt("age"));
        student.setId(resultSet.getInt("id"));
        return student;
    }
}
