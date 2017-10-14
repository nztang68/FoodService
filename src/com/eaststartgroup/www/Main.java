package com.eaststartgroup.www;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputReader = new Scanner(System.in);
        String userinput;

        Chef chef = new Chef();
        Entry comingCustomers = new Entry();
        Attender attender1 = new Attender(0);
        Attender attender2 = new Attender(1);


        while (true) {
            userinput = inputReader.next();
            chef.end();
            comingCustomers.end();
            attender1.end();
            attender2.end();
            System.exit(0);
        }
    }
}
