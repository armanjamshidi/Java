package session4;

import java.util.Scanner;

public class Session4 {
    public static void main(String[] args) {
        Author4 author1 = new Author4();
        Scanner input = new Scanner(System.in);
        System.out.println("name:");
        String name = input.next();
//         author1.setAuthorName(name);
//         System.out.println(author1.getAuthorName());
//         Scanner in =new Scanner(System.in);
//          System.out.println("email:");
//          String email=input.next();
//        author1.setAuthorName(email);
//         System.out.println(author1.getEmail());
        Author4 author2 = new Author4(name, "arman@gmail.com", "arman", 9943493);
        author2.setEmail("arman@yahoo.com");
        author2.showInfo();

        Author4 author3 = new Author4("arman", "ArmanJamshidi2002", "c++", 9943493);
        author3.showInfo();

        book4 book1 = new book4("java programming", 25);
        book1.showInfoBook();
    }
}