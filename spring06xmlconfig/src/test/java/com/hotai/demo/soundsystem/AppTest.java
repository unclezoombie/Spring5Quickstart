package com.hotai.demo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    private CompactDisk CD111;

    @Autowired
    private CompactDisk CD2;

    @Autowired
    @Qualifier("CD1111")
    private CompactDisk CD3;

    @Test
    public void testApp() {
        CD111.play();
        CD2.play();
        CD3.play();
    }
}
