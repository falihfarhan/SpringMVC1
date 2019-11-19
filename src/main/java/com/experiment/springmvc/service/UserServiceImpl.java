package com.experiment.springmvc.service;

import com.experiment.springmvc.model.Response;
import com.experiment.springmvc.model.User;
import com.experiment.springmvc.repository.UserDao;
import com.experiment.springmvc.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    User user;
    Response response=new Response();

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public List<User> getAllUser() {
        return dao.findAll();
    }

    public User getUser(int id) {
        User user = dao.findOne(id);
        return user;
    }

    public int deleteUser(int id) {
        return dao.delete(id);
    }

    public int addUser(User user) {
        return dao.save(user);
    }

    public int updateUser(User user) {
        return dao.update(user);
    }

    @Override
    public Response login(String username, String password) {
        user=dao.login(username,password);
        if (user != null){
            response.setUrl("redirect:/viewuser");
            response.setMessage("");
        } else {
            response.setUrl("redirect:/");
            response.setMessage("login gagal!");
        }
        return response;
    }
}
