package com.company;

public class Penguin extends Animal{
    public Penguin(String name, String color) {
        super(name, color);
    }

    public void layEgg(){
        System.out.println("Penguins are laying an egg.");
    }

}
