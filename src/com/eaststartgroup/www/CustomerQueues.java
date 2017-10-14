package com.eaststartgroup.www;

import java.util.LinkedList;

public class CustomerQueues {
    private static LinkedList<Customer> customerQueue1 = new LinkedList<>();
    private static LinkedList<Customer> customerQueue2 = new LinkedList<>();

    private CustomerQueues() {}

    public static void enterCustomer(int queue, Customer customer) {
        if (queue == 0) {
            customerQueue1.add(customer);
        } else {
            customerQueue2.add(customer);
        }
    }

}
