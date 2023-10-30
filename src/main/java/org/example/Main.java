package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        boolean restart;
        do {
            restart = vendingMachine.start();
        } while (restart);
    }
}