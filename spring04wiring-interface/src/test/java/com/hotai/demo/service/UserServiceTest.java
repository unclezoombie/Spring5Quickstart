package com.hotai.demo.service;

import com.hotai.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {
//    @Autowired
//    @Qualifier("userServiceNormal")
    @Resource(name="userServiceFestival")
    private UserService userService;

    @Test
    public void testUserService() {
        userService.add();
    }
}
