package exclass7.Bill;

public class Bill {

    private int serial;
    private int amount;

    public Bill(int serial, int amount) {
        this.serial = serial;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill --->    " +
                "serial= " + serial +
                "    ,    amount= " + amount;
    }
}
