package com.experiment.springmvc.service;

import com.experiment.springmvc.model.Response;
import com.experiment.springmvc.model.User;

import java.util.List;

public interface UserService {


    public List<User> getAllUser() ;

    public User getUser(int id);

    public int deleteUser(int id);

    public int addUser(User user) ;

    public int updateUser(User user) ;

    public Response login(String username, String password);

}
