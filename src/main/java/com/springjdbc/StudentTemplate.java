package com.springjdbc;


import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;;
import java.util.List;

/**
 * Created by Administrator on 2019/5/21.
 */
public class StudentTemplate implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;




    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplate= new JdbcTemplate(dataSource);

    }

    @Override
    public void create(String name, Integer age) {
        String sql = "insert into Student (name,age) values (?,?)";
        jdbcTemplate.update(sql,name,age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        String sql ="select * from Student where id = ? ";
        Student student =jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return  student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select * from student";
        List<Student>list =jdbcTemplate.query(sql,new StudentMapper());
        return list;
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from student where id = ?";
        jdbcTemplate.update(sql,new Object[]{id});
        return;
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "update Student set age = ? where id = ? ";
        jdbcTemplate.update(sql,age,id);
        return;


    }
}
