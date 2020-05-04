package com.hotai.demo.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Erick 2020.05.04:15:31
 */
public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompactDisk cd = context.getBean(CompactDisk.class);
        cd.play();
    }
}
