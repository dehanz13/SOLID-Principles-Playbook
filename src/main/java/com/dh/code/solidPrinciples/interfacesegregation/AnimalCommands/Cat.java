package com.dh.code.solidPrinciples.interfacesegregation.AnimalCommands;

public class Cat implements Animal {

    public void bark() {
        System.out.print("meow");
    }

    public void run() {
        System.out.print("Cat is running");
    }

    public void fly() {
        System.out.print("Cat cannot fly, sorry :(");
    }
}
