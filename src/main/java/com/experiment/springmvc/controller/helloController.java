package com.experiment.springmvc.controller;

import com.experiment.springmvc.model.Response;
import com.experiment.springmvc.model.User;
import com.experiment.springmvc.service.UserService;
import com.experiment.springmvc.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class helloController {

//    @Autowired
//    UserService service;
//
//    User user = new User();
//    Response response;
//
//    @Qualifier("userValidation")
//    @Autowired
//    private UserValidation userValidator;
//
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        binder.addValidators(userValidator);
//    }
//
//    //login
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String loginView(ModelMap model) {
//        model.addAttribute("user", user);
////        model.addAttribute("response", response);
//        return "user/login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@RequestParam String name, String password) {
//        response = service.login(name, password);
//        return response.getUrl();
//    }
//
//    //get all data
//    @RequestMapping(value = "/viewuser", method = RequestMethod.GET)
//    public String getAllUser(ModelMap model) {
//        model.addAttribute("listuser", service.getAllUser());
//        return "user/index";
//    }
//
//    //search
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String save(@RequestParam("param") String id, ModelMap model) {
//        model.addAttribute("search", service.getUser(Integer.valueOf(id)));
//        return "user/detail";
//    }
//
//    //detail
//    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
//    public String getUser(ModelMap model, @PathVariable int id) {
//        model.addAttribute("user", service.getUser(id));
//        return "user/detail";
//    }
//
//    //delete
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public String deleteUser(ModelMap model, @PathVariable int id) {
//        service.deleteUser(id);
//        return "redirect:/viewuser";
//    }
//
//    //add user
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addView() {
//        return new ModelAndView("user/add", "user", user);
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save(@ModelAttribute("user") @Validated User user, BindingResult result, ModelMap model) {
//        if (!result.hasErrors()) {
//            service.addUser(user);
//            return "redirect:/viewuser";//will redirect to viewemp request mapping
//        }
//        model.addAttribute("user",user);
//        return "user/add";
//    }
//
//    //edit user
//    @RequestMapping(value = "/edit/{id}")
//    public ModelAndView addView(@PathVariable int id) {
//        return new ModelAndView("user/edit", "user", service.getUser(id));
//    }
//
//    @RequestMapping(value = "/editSave", method = RequestMethod.POST)
//    public String edit(@ModelAttribute("user") User user) {
//        service.updateUser(user);
//        return "redirect:/viewuser";//will redirect to viewemp request mapping
//    }
}