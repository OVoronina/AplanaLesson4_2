package com.company.Gift;

public class Toys extends Gift {
    private String type;

    public Toys(){}

    public Toys(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toys: " + super.toString() + ", тип - " + type;
    }
}
