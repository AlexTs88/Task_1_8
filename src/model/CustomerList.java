package model;

import comparators.NameComparator;

import java.util.ArrayList;

public class CustomerList{

    ArrayList<Customer> customers;

    public CustomerList(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void showList() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void getListByName() {
        customers.sort(new NameComparator());
    }

    public void getListByCard(int from, int to) {
        for (Customer customer : customers) {
            if (customer.getCardNumber() >= from && customer.getCardNumber() <= to) {
                System.out.println(customer);
            }
        }
    }
}
