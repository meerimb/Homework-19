package com.company;

public class Whale extends Animal {
    public Whale(String name, String color) {
        super(name, color);
    }

    public void attack(){
        System.out.println("Whale can attack.");
    }
}
