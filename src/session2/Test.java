package session2;


import java.util.Scanner;

public class Test {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your text");
        String str = input.next();
        System.out.println("your text is " + str);

        System.out.println("enter your first number");
        int x = input.nextInt();
        System.out.println("your number is " + x);

        oddNumbers(x);
        evenNumbers(x);
        int numbersSum = sumOfNumbers(x);
        System.out.println("sum of numbers : "+ numbersSum);

        System.out.println("enter your second number");
        int y = input.nextInt();
        comparison(x,y);

        System.out.println("end");
        System.out.print("end\n");


    }

    public static void comparison(int x, int y) {
        if(x<y){
            System.out.println(x + "<" + y);
        }else if(x>y){
            System.out.println(x + ">" + y);
        }else {
            System.out.println(x + "=" + y);
        }
    }

    public static int sumOfNumbers(int x) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += i ;
        }
        return sum;
    }

    public static void evenNumbers(int x) {
        System.out.println("even numbers");
        for (int i = 0; i < x; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void oddNumbers(int x){
        System.out.println("odd numbers");
        for (int i = 0; i < x; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }


}
