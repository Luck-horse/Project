package com.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testday01 {

    @Test
    public void fun1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/user/applicationContext.xml");
        Object user = context.getBean("user");
        System.out.println(user);
    }
}
