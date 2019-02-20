package com.user;

import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
    public String  sayHello(){
        return "Hello World!!!!!!!!!!";
    }
}
