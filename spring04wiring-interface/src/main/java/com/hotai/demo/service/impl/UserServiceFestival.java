package com.hotai.demo.service.impl;

import com.hotai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("festival")
public class UserServiceFestival implements UserService {
    @Override
    public void add() {
        System.out.println("UserServiceFestival: a user with COUPON has been added!");
    }
}
