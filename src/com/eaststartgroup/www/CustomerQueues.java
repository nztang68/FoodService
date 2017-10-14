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

    public static Customer attendCustomer(int queue) {
        if (queue == 0) {
            if (customerQueue1.size() > 0) {
                return customerQueue1.removeFirst();
            } else {
                return null;
            }
        } else {
            if (customerQueue2.size() > 0) {
                return customerQueue2.removeFirst();
            } else {
                return null;
            }
        }
    }

    public String toString() {
        return "\tQueue 1: " + customerQueue1 + "\n" +
                "\tQueue 2: " + customerQueue2;
    }

}
