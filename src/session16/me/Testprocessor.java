package session16.me;
import java.util.Scanner;

public class Testprocessor {
    public static void main(String[]args) {
        Scanner in =new Scanner(System.in);
        String text=in.nextLine();
        Processor processor =new Processor(text);
       // processor.showtoken();
       processor.searchtoken();
        processor.reversetext();
    }
}
