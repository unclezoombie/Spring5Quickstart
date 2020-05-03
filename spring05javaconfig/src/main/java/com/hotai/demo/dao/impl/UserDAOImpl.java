package com.hotai.demo.dao.impl;
/**
 * Created by Erick 2020.04.30:09:56
 */
import com.hotai.demo.dao.UserDAO;
import org.springframework.stereotype.Repository;

public class UserDAOImpl implements UserDAO {
    @Override
    public void add() {
        System.out.println("UserDAOImpl: a new user record has been added to the DB!");
    }
}
