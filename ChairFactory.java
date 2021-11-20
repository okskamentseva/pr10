package com.company;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }
    public MagicChair createMagicianChair(String spell) {
        return new MagicChair(spell);
    }
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
