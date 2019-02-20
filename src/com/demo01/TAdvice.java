package com.demo01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("tAdvice")
@Aspect
public class TAdvice {
    @Pointcut("execution (* com.demo01.TDAO.add(..))")
    public void addPointCut(){

    }
    @Before("TAdvice.addPointCut()")
    public void addAdvice01(){
        System.out.println("记录日志-前置增强-Before");
    }
    @AfterReturning("TAdvice.addPointCut()")
    public void addAdvice02(){
        System.out.println("记录日志-后置增强-AfterReturning");
    }
    @Around("TAdvice.addPointCut()")
    public void addAdvice03(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("记录日志-环绕前置增强-Around");
        proceedingJoinPoint.proceed();
        System.out.println("记录日志-环绕后置增强-Around");

    }
    @After("TAdvice.addPointCut()")
    public void addAdvice04(){
        System.out.println("记录日志-最终增强-After");
    }
    @AfterThrowing(value = "TAdvice.addPointCut()",throwing = "e")
    public void addAdvice05(Throwable e){
        System.out.println("记录日志-异常增强-AfterThrowing");
    }
}
