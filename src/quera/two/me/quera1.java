package quera.two.me;
import java.util.Scanner;
import java.util.Stack;

public class quera1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strings = str.split(" ");
        Stack<Integer> numbers = new Stack<>();
        Stack<Integer> reversenum = new Stack<>();
        Stack<String> reverseOP = new Stack<>();
        Stack<String> operations = new Stack<>();
        numbers.push(Integer.parseInt(strings[0]));
        for (int i = 0; i < strings.length; i += 2) {
            if (i == strings.length - 1) {
                if ((strings[i - 1].equals("*") || strings[i - 1].equals("/"))) {
                    numbers.push(Integer.parseInt(strings[i]));
                    numbers.pop();

                } else {
                    if (strings[i - 1].equals("-") && Integer.parseInt(strings[i]) < 0) {
                        numbers.push(-Integer.parseInt(strings[i]));
                    } else {
                        numbers.push(Integer.parseInt(strings[i]));
                    }
                }
            } else {
                if (i > 1) {

                    if (strings[i - 1].equals("*") || strings[i - 1].equals("/")) {
                        numbers.push(Integer.parseInt(strings[i]));

                        numbers.pop();


                    } else {
                        if (strings[i - 1].equals("-") && Integer.parseInt(strings[i]) < 0) {
                            numbers.push(-Integer.parseInt(strings[i]));

                        } else {
                            numbers.push(Integer.parseInt(strings[i]));

                        }
                    }
                }
            }
            if (i != strings.length - 1) {
                if (strings[i + 1].equals("-") && Integer.parseInt(strings[i + 2]) < 0) {
                    operations.push("+");

                } else {
                    operations.push(strings[i + 1]);

                }

                if (strings[i + 1].equals("*")) {
                    numbers.push(Integer.parseInt(strings[i + 2]));
                    operations.pop();
                    int m = numbers.pop();
                    int k = numbers.pop();
                    numbers.push(k * m);
                } else if (strings[i + 1].equals("/")) {
                    numbers.push(Integer.parseInt(strings[i + 2]));
                    operations.pop();
                    int m = numbers.pop();
                    int k = numbers.pop();
                    numbers.push(k / m);
                }
            }

        }
        while (!numbers.empty()) {
            reversenum.push(numbers.pop());
        }
        while (!operations.empty()) {
            reverseOP.push(operations.pop());

        }
        while (!reverseOP.empty()) {
            if (reverseOP.peek().equals("-")) {
                reverseOP.pop();
                int l = reversenum.pop();
                int s = reversenum.pop();
                reversenum.push(l - s);
            } else if (reverseOP.peek().equals("+")) {
                reverseOP.pop();
                int l = reversenum.pop();
                int s = reversenum.pop();
                reversenum.push(l + s);
            }
        }

        System.out.println(reversenum.peek());
    }
}

