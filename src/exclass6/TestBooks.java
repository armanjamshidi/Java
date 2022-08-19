package exclass6;

public class TestBooks {
    public static void main(String[] args) {
        Books books = new Books(10);

        Book book1 = new Book("Career of Evil", "j.k.Rowling", "Tandis", new Shabak(2, 97000, 9, 6));
        Book book2 = new Book("Secret", "Rhonda Byrne", "ghasedak Saba", new Shabak(2, 96123, 23, 9));
        Book book3 = new Book("Momayez", "Farzad Adibi", "Bamdade no", new Shabak(1, 96110, 19, 1));
        Book book4 = new Book("Casual Vacancy", "j.k.Rowling", "Tandis", new Shabak(2, 92101, 7, 4));

        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);
        books.addBook(book4);

        books.printBookDetails();
        System.out.println("- - - - - - - - - - - ");
        books.findBookByAuthorName("j.k.Rowling").printBookDetails();
        System.out.println("- - - - - - - - - - - ");
        books.findBookByShabak(new Shabak(1, 96110, 19, 1)).printBookDetails();
        System.out.println("- - - - - - - - - - - ");
        books.findBookByBookTitlePart("re").printBookDetails();

    }

}
