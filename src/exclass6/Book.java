package exclass6;

public class Book {
    private String bookTitle;
    private String author;
    private String publisher;
    private Shabak shabakNumber;

    public Book(String bookTitle, String author, String publisher, Shabak shabakNumber) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.shabakNumber = shabakNumber;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Shabak getShabakNumber() {
        return shabakNumber;
    }

    public void setShabakNumber(Shabak shabakNumber) {
        this.shabakNumber = shabakNumber;
    }

    @Override
    public String toString() {
        String details = "Book Title: " +
                bookTitle +
                "\nBook Author: " +
                author +
                "\nPublisher: " +
                publisher;
        if (shabakNumber.getLanguageNumber() == 1)
            details += ("\nShabak in Iran: " + shabakNumber);
        else
            details += ("\nShabak in abroad: " + shabakNumber);
        return details;
    }
}
