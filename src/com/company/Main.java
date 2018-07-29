package com.company;

import com.company.Gift.*;

public class Main {

    public static void main(String[] args) {
        Candy candy1 = new Candy("name1", 15.0, 200.0, "strawberry");
        Jellybean jellybean1 = new Jellybean("name2", 12.0, 150.0, "yellow");
        Toys toys1 = new Toys();
        toys1.setName("name3");
        toys1.setWeight(14.0);
        toys1.setPrice(220.0);
        toys1.setType("зайка");
        Candy candy2 = new Candy("name4", 15.0, 200.0, "chocolate");
        Jellybean jellybean2 = new Jellybean("name5", 12.0, 150.0, "red");

        Gift meshok[] = {candy1, jellybean1, toys1, candy2, jellybean2};
        for (Gift box:meshok) {
            System.out.println(box.toString());
        }
        System.out.println("Общий вес подарка: " + (candy1.getWeight() + candy2.getWeight() + jellybean1.getWeight() + jellybean2.getWeight() + toys1.getWeight()));
        System.out.println("Цена подарка: " + (candy1.getPrice() + candy2.getPrice() + jellybean1.getPrice() + jellybean2.getPrice() + toys1.getPrice()));
    }
}
