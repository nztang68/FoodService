package com.eaststartgroup.www;

public class Customer {
    public int id, timeToDecide;
    public String desiredFood;

    public Customer(int id, int timeToDecide, String desireedfood) {
        this.id = id;
        this.timeToDecide = timeToDecide;
        this.desiredFood = desireedfood;
    }

    public String toString() {
        return "Customer #" + this.id;
    }

}
