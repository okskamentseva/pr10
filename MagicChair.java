package com.company;

public class MagicChair implements Chair {
    private boolean busy = false;
    private String spell;

    MagicChair(String spell) {
        this.spell = spell;
    }

    public void doMagic() {
        // some magic
    }

    public void sitDown() {
        this.busy = true;
        System.out.println("Hi! I am a magic chair");
    }

    public void getUp() {
        this.busy = false;
    }

    public boolean isBusy() {
        return this.busy;
    }
}
