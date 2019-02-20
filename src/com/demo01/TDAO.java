package com.demo01;

import org.springframework.stereotype.Component;

@Component("tDAO")
public class TDAO {
    public void add(){
        System.out.println("添加");
    }
    public void del(){
        System.out.println("删除");
    }
}
