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
        int timeToCook, whichFood;
        timeToCook = 2000 + 1000*randomGenerator.nextInt(3);
        while (this.threadAlive) {
            try {
                this.sleep(timeToCook);
                whichFood = randomGenerator.nextInt(3);
                System.out.print("Chef on " + (timeToCook/1000) + " seconds cook a ");
                switch (whichFood) {
                    case 0:
                        FoodStock.cookSellBurger("cook");
                        System.out.println("burger");
                        break;
                    case 1:
                        FoodStock.cookSellSandwich("cook");
                        System.out.println("sandwich");
                        break;
                    case 2:
                        FoodStock.cookSellSalad("cook");
                        System.out.println("salad");
                        break;
              }
            } catch (InterruptedException e) {
                System.out.println("Chef interrupted.");
            }
        }

    }

    public void end() {
        this.threadAlive = false;
    }
}
