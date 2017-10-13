package com.eaststartgroup.www;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputReader = new Scanner(System.in);
        String userinput;

        Chef chef = new Chef();
        Entry comingcustomers = new Entry();
        Attender attender1 = new Attender(0);
        Attender attender2 = new Attender(1);


        while (true) {
            userinput = inputReader.next();
            chef.end();
            comingcustomers.end();
            attender1.end();

        }
    }
}
