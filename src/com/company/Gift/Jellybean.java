package com.company.Gift;

public class Jellybean extends Gift {
    private String color;

    public Jellybean(){}

    public Jellybean(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean: " + super.toString() + ", цвет - " + color;
    }
}
