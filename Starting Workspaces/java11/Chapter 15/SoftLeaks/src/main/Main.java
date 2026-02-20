package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        while (true){
            Customer c = new Customer("SomeName");
            customers.add(c);
            if(customers.size() > 100_000){
                for (int i = 0; i < 90_000; i++){
                    customers.remove(0);
                }
            }
        }
    }

}
