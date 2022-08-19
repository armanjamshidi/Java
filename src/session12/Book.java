package session12;

public class Book {
    private String bookName;
    private String bookID;
    private int bookPrice;

    public Book(String bookName, String bookID, int bookPrice) {
        this.bookName = bookName;
        this.bookID = bookID;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return String.format("bookName: %s , bookId: %s , bookPrice: %d", bookName, bookID, bookPrice);
    }
}

