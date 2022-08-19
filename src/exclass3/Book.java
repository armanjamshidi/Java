package exclass3;

public class Book {
    String name;
    int price;
    int dis;

    //this can be used to refer current class instance variable.
    public Book(String name, int price, int dis) {
        this.name = name;
        this.price = price;
        this.dis = dis;
    }

    //this() can be used to invoke current class constructor.
    public Book(String name, int price) {
        this(name, price, 0);
    }

}
