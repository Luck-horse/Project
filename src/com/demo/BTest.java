package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/demo/applicationContext.xml"})
public class BTest {
    @Autowired
    @Qualifier("bdao")
    private BDao bDao;
    @Test
    public void testfun(){
        bDao.add();
        bDao.del();
    }
}
