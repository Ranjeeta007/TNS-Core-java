package com.tnsif.polymorphism;

// Demo for Method Overriding
class Payment {

    Payment() {

    }

    void makePayment() {
        System.out.println("Processing payment using method");
    }
}

// Subclass
class UPIPayment extends Payment {

    UPIPayment() { // Constructor can't be overridden

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

public class PaymentTest {

    public static void main(String[] args) {

        UPIPayment u = new UPIPayment();
        u.makePayment();

        CardPayment v = new CardPayment();
        v.makePayment();
    }
}