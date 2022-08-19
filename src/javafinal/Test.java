package javafinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static  void main(String[] args) {
        Customer cus = new Customer();
        Purchase num1=new Purchase("123",1000);
        Purchase num2=new Purchase("124",2000);
        List <String>n1=new ArrayList<>();
        n1.add("a");
        ArrayList <Purchase>n2=new ArrayList<>();
        n2.add(num2);
        HashMap<String, List<Purchase>> customers=new HashMap<>();

customers.put("arman",n2);
        System.out.println(cus.bestCustomer(customers));

Sort sort=new Sort();

    }
}
