package com.company;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicianChair(String spell);
    FunctionalChair createFunctionalChair();
}
