package com.company;

public class VictorianChair implements Chair {
    private int age;
    private boolean busy = false;

    VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void sitDown() {
        this.busy = true;
        System.out.println("Hi! I am a victorian chair");
    }

    public void getUp() {
        this.busy = false;
    }

    public boolean isBusy() {
        return this.busy;
    }
}
