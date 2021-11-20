package com.company;

public class Client {
    private Chair chair;
    public void sit() {
        if (!chair.isBusy()) {
            chair.sitDown();
        }
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
