package com.company;

public class FunctionalChair implements Chair {
    private boolean busy = false;

    public int sum(int a, int b) {
        return a + b;
    }

    public void sitDown() {
        this.busy = true;
        System.out.println("Hi! I am a functional chair");
    }

    public boolean isBusy() {
        return this.busy;
    }
}
