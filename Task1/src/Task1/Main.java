package Task1;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer a = new Customer("Otto", "Toubro", "DonDyva");
        customers.add(a);
        Customer b = new Customer("William", "Dilliam", "WillerDiller");
        customers.add(b);
        Customer c = new Customer("Julian", "Isak", "Bob");
        customers.add(c);

        printCustomers(customers);
    }

    static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer i : customers)
        {
        System.out.println(i);
        }
    }
}
