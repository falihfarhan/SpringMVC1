package com.experiment.springmvc.repository;

import com.experiment.springmvc.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public User login(String name, String password) {
        User user = new User();
        try {
            String sql = "select * from user where name=? AND password=?";
            user = template.queryForObject(sql, new Object[]{name, password},
                    new BeanPropertyRowMapper<User>(User.class));
        } catch (Exception se) {
            return null;
        }
        return user;
    }

    @Override
    public int save(User user) {
        String sql = "insert into user(name,password,age) values('" + user.getName() + "','" + user.getPassword() + "'," + user.getAge() + ")";
        return template.update(sql);
    }

    @Override
    public int update(User user) {
        String sql = "update user set name='" + user.getName() + "', password='" + user.getPassword() + "',age=" + user.getAge() + " where id=" + user.getId();
        return template.update(sql);
    }

    @Override
    public int delete(int id) {
        String sql = "delete from user where id=" + id;
        return template.update(sql);
    }

    @Override
    public User findOne(int id) {
        String sql = "select * from user where id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public List<User> findAll() {
        return template.query("select * from user", new RowMapper<User>() {
            public User mapRow(ResultSet rs, int row) throws SQLException {
                User e = new User();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setAge(rs.getInt(4));
                return e;
            }
        });
    }

    @Override
    public List<User> findAllByParam(String param) {
        return template.query("select * from user where id=? or name=? or age=? or password=?", new RowMapper<User>() {
            public User mapRow(ResultSet rs, int row) throws SQLException {
                User e = new User();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setAge(rs.getInt(4));
                return e;
            }
        });
    }
}
