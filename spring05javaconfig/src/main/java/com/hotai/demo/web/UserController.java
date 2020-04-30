package com.hotai.demo.web;

import com.hotai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Erick 2020.04.30:09:57
 */
public class UserController {

    @Autowired
    private UserService service;

    public void addUser() {
        System.out.println("UserController is creating ...");
        service.add();
    }
}
