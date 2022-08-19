package session13;

import java.util.Random;

public class TestRandom {

    public static void main(String args[]) {

        Random rand = new Random();

//        System.out.println((char)('A' + rand.nextInt('Z' - 'A' + 1))); //me
        int number;
        System.out.println(rand.nextInt(100));
        System.out.println((int)'A');
        System.out.println((int)'Z');
//        number=rand.nextInt(n);   [0,n-1]
        number = rand.nextInt(10);   //[0,9]
        System.out.println(number);
        System.out.println(getRandom(rand, 10, 100));

//        for (int i = 0; i < 20; i++) {   //[1,6];
//            number = 1 + rand.nextInt(6);
//            System.out.println(number);
//
//        }


        System.out.println(getUpperCaseRandomString(rand, 10));
    }

    public static int getRandom(Random rand, int min, int max) {   //[min,max]
        return min + rand.nextInt(max - min + 1);
        //  0<=nextInt(max-min+1)<=max-min
        //  min<=min+nextInt(max-min+1)<=max

    }

    public static String getUpperCaseRandomString(Random rand, int len) {
        // len=3     GHR    WQI   KUY
        String temp = "";
        char c;
        for (int i = 0; i < len; i++) {
            c = (char) ('A' + rand.nextInt('Z' - 'A' + 1));//A=65 Z=90
            temp += c;

        }
        return temp;
    }
}
