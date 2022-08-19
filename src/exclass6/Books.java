package exclass6;

public class Books {
    private int n;
    private Book[] allBooks;
    private int len = 0;

    public Books(int n) {
        this.n = n;
        allBooks = new Book[n];
    }

    public void addBook(Book book) {
/*
        //
        allBooks[len] = book;
        len+=1;
        //
        allBooks[len] = book;
        len++;
        //
        */
        allBooks[len++] = book;
    }
    // allBooks[++len] = book;


    public Books findBookByAuthorName(String name) {
        Books findBooks = new Books(len + 1);

        for (int i = 0; i < len; i++)
            if (allBooks[i].getAuthor().equals(name))
                findBooks.addBook(allBooks[i]);

        return findBooks;
    }

    public Books findBookByShabak(Shabak shabak) {
        Books findBooks = new Books(len + 1);

        for (int i = 0; i < len; i++)
            if (allBooks[i].getShabakNumber().toString().equals(shabak.toString()))
                findBooks.addBook(allBooks[i]);

        return findBooks;
    }

    public Books findBookByBookTitlePart(String title) {
        Books findBooks = new Books(len + 1);

        for (int i = 0; i < len; i++)
            if (allBooks[i].getBookTitle().contains(title))
                findBooks.addBook(allBooks[i]);

        return findBooks;
    }

    public void printBookDetails() {
        for (int i = 0; i < len; i++)
            System.out.println(allBooks[i] + "\n");
    }

}
