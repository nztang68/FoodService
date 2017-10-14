package com.eaststartgroup.www;

import java.util.Random;

class Entry extends Thread {
    Random randomGenerator = new Random();
    private static int IDs;
    private boolean threadAlive = true;

    public Entry() {}



    public void end() {
        this.threadAlive = false;
    }
}
