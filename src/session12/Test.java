package session12;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("1", "1234", 23);
        Book book2 = new Book("2", "4567", 17);
        Book[] books = new Book[10];
        books[0] = book1;
        books[1] = book2;

        Author author=new Author();
        author.setAuthorName("reza");
        author.setHomeAddress("yazd");
        author.setBooks(books);
      //  Author author1 = new Author("reza", "yazd", books);
        System.out.println(author);
        System.out.println(author.bookInformation());


    }

}
