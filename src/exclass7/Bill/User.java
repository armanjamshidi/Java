package exclass7.Bill;

import java.util.LinkedList;
import java.util.List;

public class User {

    private String username;
    private List<Bill> billList;

    public User(String username) {
        this.username = username;
        billList = new LinkedList<>();
    }

    public void addBill(Bill newBill) {
        billList.add(newBill);
    }

    public void printAllBills() {
        if (billList.isEmpty())
            System.out.println("No bill Added...!");

        for (Bill bill : billList)
            System.out.println(bill);
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "\t\t\t Hello " + this.username + "\n\n\n";
    }
}
