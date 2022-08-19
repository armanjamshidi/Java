package javafinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Customer {


    public String bestCustomer(HashMap<String, List<Purchase>> customers) {
        String customer = "";
        ArrayList<Double> prices = new ArrayList<>();

        for (String str : customers.keySet()) {
            for (Purchase purchase : customers.get(str)) {
                prices.add(purchase.getPrice());

            }

        }
        double maximum = Collections.max(prices);
        for (String str : customers.keySet()) {
            for (Purchase purchase : customers.get(str)) {
                if (purchase.getPrice() == maximum) {
                    customer = str;
                    break;
                }

            }

        }
        return customer;
    }
}
