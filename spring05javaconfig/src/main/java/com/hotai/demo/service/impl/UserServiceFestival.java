package com.hotai.demo.service.impl;

import com.hotai.demo.dao.UserDAO;
import com.hotai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class UserServiceFestival implements UserService {
    @Autowired
    private UserDAO userDAO;

    public UserServiceFestival() {
        super();
        System.out.println("UserServiceFestival has bean created by constructor with no parameters!");
    }

    @Override
    public void add() {
        userDAO.add();
        System.out.println("UserServiceFestival: a user with COUPON has been added!");
    }
}
