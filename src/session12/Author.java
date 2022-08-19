package session12;

public class Author {
    private String authorName;
    private String homeAddress;
    private Book[] books;

    public Author() {
        this.books = new Book[10];
    }

    public Author(String authorName, String homeAddress, Book[] books) {
        this.authorName = authorName;
        this.homeAddress = homeAddress;
        this.books = books;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String bookInformation() {
        String bookinfo = "";
//        for (book bok:books)
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                bookinfo += books[i].toString() + "\n";
        }
        return bookinfo;
    }

    public void findbook(String bookname) {

        for (Book book : books) {
            if (book != null) {
                if (book.getBookName().equals(bookname)) {
                    System.out.println("book with this name :");
                    System.out.println(book);
                }
            }
        }


    }

    public void findBook(String bookId) {
        for (Book bk : books) {
            if (bk != null) {
                if (bk.getBookID().equals(bookId)) {
                    System.out.println("book with this id :");
                    System.out.println(bk);
                }
            }

        }
    }

    @Override
    public String toString() {
        return String.format("authorName: %s , address: %S , %n bookInfo: %s", authorName, homeAddress, bookInformation());
    }
}
