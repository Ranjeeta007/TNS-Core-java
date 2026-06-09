package com.tnsif.finalprograms;

// Demo for final variable
public class Finalvariable {

    final int x;      // final instance variable
    final int s = 90;

    final static int y;
    final static int z = 70;

    static {
        y = 70;
        // z = 4; // Error: final variable cannot be reassigned
    }

    // Constructor
    public Finalvariable() {
        x = 9;
    }
}