package com.jajahome.model;

public class Person {
    private String name;
    private BlueCar blueCar;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar2(BlueCar blueCar) {
        this.blueCar = blueCar;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", blueCar=" + blueCar + "]";
    }


}
