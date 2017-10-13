package com.eaststartgroup.www;

class Chef extends Thread {

    private boolean threadalive = true;

    public void end() {
        this.threadalive = false;
    }
}
