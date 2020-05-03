package com.hotai.demo.service.impl;

import com.hotai.demo.dao.UserDAO;
import com.hotai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class UserServiceNormal implements UserService {
    private UserDAO userDAO;

    public UserServiceNormal() {
        super();
        System.out.println("UserServiceNormal has bean created by constructor with no parameters!");
    }

    public UserServiceNormal(UserDAO userDAO) {
        super();
        this.userDAO = userDAO;
        System.out.println("UserServiceNormal has bean created by constructor with parameters[" +userDAO +"]!");
    }

    @Override
    public void add() {
        userDAO.add();
        System.out.println("UserServiceNormal: a user has been added!");
    }
}
