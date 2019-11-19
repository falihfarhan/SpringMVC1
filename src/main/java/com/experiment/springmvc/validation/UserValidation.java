package com.experiment.springmvc.validation;


import java.util.regex.Pattern;

import com.experiment.springmvc.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author imssbora
 */
@Component
public class UserValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors err) {

        ValidationUtils.rejectIfEmpty(err, "name", "user.name.empty");
        ValidationUtils.rejectIfEmpty(err, "password", "user.password.empty");
        ValidationUtils.rejectIfEmpty(err, "age","user.age.invalid");


    }
}