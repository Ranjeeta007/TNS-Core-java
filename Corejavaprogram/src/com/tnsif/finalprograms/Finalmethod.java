package com.tnsif.finalprograms;

// Demo for method overriding

class Father {
    int a = 90;

    void display() {
        System.out.println("Welcome to Java");
    }
}

public class Finalmethod extends Father {

    @Override
    void display() {
        System.out.println("Welcome to Python");
    }
}