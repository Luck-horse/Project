package com.demo;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强");
    }
}
