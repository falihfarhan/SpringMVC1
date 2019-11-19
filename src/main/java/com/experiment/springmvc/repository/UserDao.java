package com.experiment.springmvc.repository;

import com.experiment.springmvc.model.User;

import java.util.List;



public interface UserDao {
    public User login(String username, String password);
    public int save(User user);
    public int  update(User user);
    public int delete(int id);
    public User findOne(int id);
    public List<User> findAll();
    public List<User> findAllByParam(String param);
}
