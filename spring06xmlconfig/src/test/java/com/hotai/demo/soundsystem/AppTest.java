package com.hotai.demo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    private CompactDisk CD1;

    @Autowired
    private CompactDisk CD2;

    @Test
    public void testApp() {
        CD1.play();
        CD2.play();
    }
}
