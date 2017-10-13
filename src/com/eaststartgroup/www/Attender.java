package com.eaststartgroup.www;

public class Attender extends Thread {
    private int whichQueue;
    private boolean threadAlive = true;

    public Attender(int whichQueue) {
        this.whichQueue = whichQueue;
    }

    public void end() {
        this.threadAlive = false;
    }
}
