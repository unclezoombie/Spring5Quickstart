package com.hotai.demo.service.impl;

import com.hotai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class UserServiceNormal implements UserService {
    @Override
    public void add() {
        System.out.println("UserServiceNormal: a user has been added!");
    }
}
