package exclass3;

import java.util.Random;

public class ClassMath {
    public static void main(String[] args) {

        System.out.println(Math.min(12, 5));
        System.out.println(Math.max(12, 5));

        System.out.println(Math.PI);

        //The method gives the absolute value of the argument. The argument can be int, float, long, double, short, byte.
        System.out.println(Math.abs(-123));

        //Math.sqrt() returns the square root of a value of type double passed to it as argument.
        System.out.println(Math.sqrt(64));

        //Math.pow() is used to calculate a number raise to the power of some other number.
        System.out.println(Math.pow(2, 5));

        // get random num
        for (int i = 0; i < 10; i++)
            System.out.println((int) (1 + (Math.random()) * 9));

        Random random = new Random();

    }
}
