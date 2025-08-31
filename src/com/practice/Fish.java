package com.practice;

public class Fish implements  Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("The fish can also hunts!");

    }

    @Override
    public void flee() {
        System.out.println("The fish can also be eaten");
    }
}
