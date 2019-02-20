package com.demo;

import org.springframework.stereotype.Service;

@Service("bDao")
public class BDao {
    public void add(){
        System.out.println("+++++++++++");
    }
    public void del(){
        System.out.println("——————");
    }
}
