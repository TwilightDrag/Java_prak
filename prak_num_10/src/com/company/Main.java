package com.company;

public class Main {
    public static void main(String[] args) {
        ChairFactory vic = new ChairFactory();
        Client app = new Client();
        app.sit();
        app.setChair(vic.createVictorianChair());
        app.sit();
        app.setChair(vic.createMagicChair());
        app.sit();
        app.setChair(vic.createFunctionalChair());
    }
}
