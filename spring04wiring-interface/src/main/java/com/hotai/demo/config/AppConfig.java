package com.hotai.demo.config;

import com.hotai.demo.dao.UserDAO;
import com.hotai.demo.service.UserService;
import com.hotai.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//@ComponentScan("com.hotai.demo")
//@ComponentScan(basePackages = "com.hotai.demo")
//@ComponentScan(basePackages = {"com.hotai.demo.service", "com.hotai.demo.web", "com.hotai.demo.dao"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDAO.class})
public class AppConfig {
}
