package com.tnsif.polymorphismdemo;

// Demo for method overriding

class Payment {

    Payment() {

    }

    void makePayment() {
        System.out.println("Processing payment using base method");
    }
}

// Subclass
class UPIPayment extends Payment {

    UPIPayment() {   // Constructor can't be overridden

    }

    @Override
    void makePayment() {
        System.out.println("Payment using UPI");
    }
}

class CardPayment extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment using credit card");
    }
}

public class Methodoverriding {

    public static void main(String[] args) {

        UPIPayment u = new UPIPayment();
        u.makePayment();

        CardPayment v = new CardPayment();
        v.makePayment();
    }
}