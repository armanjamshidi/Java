package javafinal;

import java.util.HashMap;
import java.util.List;

public class Purchase {
    String code;
    double price;

    public Purchase(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}
