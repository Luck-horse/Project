package com.spring;

public class HelloImpl implements Hello {
    private String name;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "HelloImpl{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!"+name+"|||"+this.cat);
    }
}
