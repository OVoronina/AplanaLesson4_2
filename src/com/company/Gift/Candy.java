package com.company.Gift;

public class Candy extends Gift {
    private String taste;

    public Candy() {}

    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Candy: " + super.toString() + ", вкус - " + taste;
    }
}
