package com.company;

public class Main {

    public static void main(String[] args) {
        Client c = new Client();
        ChairFactory factory = new ChairFactory();
        Chair[] chairs = new Chair[4];
        chairs[0] = factory.createFunctionalChair();
        chairs[1] = factory.createMagicianChair("abracadabra");
        chairs[2] = factory.createVictorianChair(20);
        chairs[3] = factory.createVictorianChair(98);

        c.setChair(chairs[0]);
        c.sit();
    }
}
