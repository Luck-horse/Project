package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void springTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();
    }
}
