package session16.javaclass;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Processor processor = new Processor(text , 123);
        processor.showTokens();
        processor.findToken("java");
        processor.reverseToken();
        processor.revereseText();

        processor.sumOfDigits();




    }


}
