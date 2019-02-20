package com.user;

import org.springframework.stereotype.Component;

@Component("user")
public class UserInfo {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                '}';
    }
}
