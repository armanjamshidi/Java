package exclass1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // input and Scanner
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.nextLine();
        int n = in.nextInt();

        //Output
        System.out.println();
        System.out.print("");
        System.out.format("2 * 3 = %d\n", 6);
        System.out.format("2 * 3 != %f\n", 6.5);
        System.out.format("2 * 3 = %s", "six");
        System.out.printf("");

    }
}
