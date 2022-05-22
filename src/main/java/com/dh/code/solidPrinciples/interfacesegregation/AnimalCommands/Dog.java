package com.dh.code.solidPrinciples.interfacesegregation.AnimalCommands;

public class Dog implements Animal {

    public void bark() {
        System.out.print("woof woof");
    }

    public void run() {
        System.out.print("Dog is running");
    }

    public void fly() {
        System.out.print("Dog cannot fly, sorry :(");
    }
}
