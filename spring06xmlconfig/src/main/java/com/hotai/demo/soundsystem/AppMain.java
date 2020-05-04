package com.hotai.demo.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Erick 2020.05.04:15:31
 */
public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompactDisk cd1 = (CompactDisk) context.getBean("CD1");
        CompactDisk cd2 = (CompactDisk) context.getBean("CD2");
        cd1.play();
        cd2.play();
    }
}
