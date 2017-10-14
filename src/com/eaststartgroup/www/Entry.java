package com.eaststartgroup.www;

public class Entry extends Thread {
    private boolean threadAlive = true;

    public void end() {
        this.threadAlive = false;
    }
}
