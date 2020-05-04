package com.hotai.demo.config;

import com.hotai.demo.dao.UserDAO;
import com.hotai.demo.dao.impl.UserDAOImpl;
import com.hotai.demo.dao.impl.UserDaoCache;
import com.hotai.demo.service.UserService;
import com.hotai.demo.service.impl.UserServiceFestival;
import com.hotai.demo.service.impl.UserServiceNormal;
import com.hotai.demo.web.UserController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan
//@ComponentScan("com.hotai.demo")
//@ComponentScan(basePackages = "com.hotai.demo")
//@ComponentScan(basePackages = {"com.hotai.demo.service", "com.hotai.demo.web", "com.hotai.demo.dao"})
//@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDAO.class})
public class AppConfig {
    @Bean
    public UserDAO userDAOImpl () {
        System.out.println("AppConfig: creating userDAOImpl!");
        return new UserDAOImpl();
    }

    @Bean("cacheDAO")
    public UserDAO userDaoCache () {
        System.out.println("AppConfig: creating userDaoCache!");
        return new UserDaoCache();
    }
    @Bean("dbDAO")
    public UserService userService(@Qualifier("cacheDAO") UserDAO userDAO) {
        System.out.println("AppConfig: creating UserService!");
        return new UserServiceNormal(userDAO);
    }

    @Bean
    public UserController userController() {
        System.out.println("AppConfig: creating UserController!");
        return new UserController();
    }
}
