package com.eaststartgroup.www;

public class Entry extends Thread {
    private boolean threadalive = true;

    public void end() {
        this.threadalive = false;
    }
}
