package com.eaststartgroup.www;

import java.util.Random;

class Chef extends Thread {
    Random randomGenerator = new Random();
    private boolean threadAlive;

    {
        threadAlive = true;
    }

    public Chef() {}

    @Override
    public void run() {
        super.run();
        int timeToCook = 0, whichFood = 0;
        timeToCook = 2000 + 1000*randomGenerator.nextInt(3);
        try {
            this.sleep(timeToCook);
            whichFood = randomGenerator.nextInt(3);
            System.out.print("Chef on " + (timeToCook/1000) + " seconds cook a ");
            switch (whichFood) {
                case 0:
                    FoodStock.cookSellBurger("cook");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void end() {
        this.threadAlive = false;
    }
}
