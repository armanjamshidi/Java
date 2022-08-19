package quera.one;
import java.util.Scanner;

public class dastgarmi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] strs = str.split("");
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < i; j++) {
                strs[j] = strs[i];
            }
            for (String s : strs) {
                System.out.print(s);
            }
            System.out.println("");

        }
    }
}
