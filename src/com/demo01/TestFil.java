package com.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/demo01/applicationContext.xml")
public class TestFil {
    @Autowired
    @Qualifier("tDAO")
    private TDAO tdao;
    @Test
    public  void testFun(){
        tdao.add();
        System.out.println("______________________");
        tdao.del();
    }
}
