package com.inversion.of.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //Object of interface from required class.
        ApplicationContext context = new ClassPathXmlApplicationContext("appInversionOfControl.xml");

        UserManager psql = (UserManager) context.getBean("psqlUser");
        UserManager ws = (UserManager) context.getBean("wsUser");

        System.out.println(psql.getUserInfo());
        System.out.println(ws.getUserInfo());
    }
}
