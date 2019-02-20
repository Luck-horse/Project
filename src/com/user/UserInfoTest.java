package com.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInfoTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/user/applicationContext.xml");
        UserInfo user = (UserInfo) context.getBean("user");
        System.out.println(user);
    }
}
