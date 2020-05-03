package com.hotai.demo.dao.impl;

import com.hotai.demo.dao.UserDAO;

public class UserDaoCache implements UserDAO {
    @Override
    public void add() {
        System.out.println("UserDaoCache: a new user record has been added to the CACHE!");
    }
}
