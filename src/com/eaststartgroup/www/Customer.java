package com.eaststartgroup.www;

public class Customer {
    public int id, timetodecide;
    public String desiredfood;

    public Customer(int id, int timetodecide, String desireedfood) {
        this.id = id;
        this.timetodecide = timetodecide;
        this.desiredfood = desireedfood;
    }

    public String toString() {
        return "Customer #" + this.id;
    }

}
