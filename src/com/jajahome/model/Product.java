package com.jajahome.model;

public class Product {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setUp() {
        System.out.println("初始化方法执行...");
    }

    public void tearDown() {
        System.out.println("销毁的方法执行...");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
