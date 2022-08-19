package exclass3;

public class Debug {
    public static void main(String[] args) {

        int input = 123;
        System.out.printf("sum of numbers is : %d", sumDigit(input));

    }

    public static int sumDigit(int n) {
        int sum = 0;
        int len = findLen(n);
        for (int i = 1; i <= len; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static int findLen(int n) {
        int counter = 0;
        int firstN = n;
        while (n > 0) {
            counter++;
            n /= 10;
        }
        System.out.printf("for %d , number of digits is : %d\n", firstN, counter);
        return counter;
    }
}
