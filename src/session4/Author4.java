package session4;

public class Author4 {
    private String authorName;
    private String email;
    private String bookName;
    private int authorID;

    public Author4() {
        System.out.println("created");
    }

    public Author4(String authorName, String email, String bookName, int authorID) {
        this.authorName = authorName;
        this.email = email;
        this.bookName = bookName;
        this.authorID = authorID;
    }

    public void showInfo() {
        System.out.println("authorName : " + authorName);
        System.out.println("email : " + email);
        System.out.println("bookName : " + bookName);
        System.out.println("authorID : " + authorID);
    }

    public void setEmail(String mail) {
        email = mail;
    }

}
