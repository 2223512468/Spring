package com.jajahome.model;

public class RedCar {
    private String name;
    private Double price;

    public RedCar() {
        super();
    }

    public RedCar(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RedCar [name=" + name + ", price=" + price + "]";
    }
	
}
