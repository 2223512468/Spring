package com.jajahome.model;

public class BlueCar {
    private String name;
    private Double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BlueCar [name=" + name + ", price=" + price + "]";
    }


}
