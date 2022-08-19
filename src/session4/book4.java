package session4;

public class book4 {
    private String bookName;
    private int price;

    public book4(String bookName, int price)//constructor
    {
        this.bookName = bookName;
        this.price = price;
    }

    public void showInfoBook() {
        System.out.println("bookName:" + bookName);
        System.out.println("price:" + price);
    }
}