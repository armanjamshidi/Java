package exclass2;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        /*
         * The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
         */
        String s1 = "Java_Class";
        System.out.println(s1.substring(s1.indexOf("J"), s1.indexOf("_")));

        /*
         * The length() method returns the number of characters present in the string.
         */
        System.out.println(s1.length());

        System.out.println("----------------------------");

        /*
         * This method returns new String object containing the substring of the given string from specified startIndex.
         */
        myPrintString(s1.substring(3));

        /*
         * This method returns new String object containing the substring of the given string from specified startIndex to endIndex.
         */
        myPrintString(s1.substring(3), s1.substring(3, 6));


        System.out.println("----------------------------");

        /*
         * This method breaks a given string around matches of the given regular expression.
         */
        String[] aStr1 = s1.split("_");
        String[] aStr2 = s1.split("a", 3);
        myPrintAString(aStr1, aStr2);

        System.out.println("----------------------------");

        /*
         * The charAt() method returns the character at the specified index in a string.
         */
        System.out.println(s1.charAt(5));

        System.out.println("----------------------------");

        /*
         * This method converts this string into character array.
         */
        char[] chars = s1.toCharArray();

        for (char c : chars)
            if (c != 'a')
                System.out.print(c + " , ");

        System.out.println("\n----------------------------");

        /*
         * This function converts a char[] to a string.
         */
        char[] chars1 = {'j', 'a', 'v', 'a'};
        String str = "";

        for (char c : chars1)
            str += c;
        System.out.println(str);

        System.out.println("----------------------------");

        /*
         * The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
         */
        System.out.println(s1.indexOf("av"));

        /*
         * The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
         */
        System.out.println(s1.lastIndexOf("a"));

        System.out.println("----------------------------");

        /*
         * The trim() method removes whitespace from first and ends of a string.
         */
        String str2 = "     ja va       ";
        System.out.println(str2 + " Class");
        System.out.println(str2.trim() + " Class");

        System.out.println("----------------------------");

        /*
         * The concat() method appends a string to the end of another string.
         */
        String str3 = "Java";
        System.out.println(str3.concat(" Class"));

        System.out.println("----------------------------");

        /*
         * The contains() method checks whether a string contains a sequence of characters.
         */
        System.out.println(s1.contains("-"));
        System.out.println(s1.contains("ava"));

        System.out.println("----------------------------");

        Scanner in = new Scanner(System.in);
        String str4 = "Home";
        String inputString = in.next();

        if (str4 == inputString)
            System.out.println("yes ---> 1");
        else
            System.out.println("No ---> 1");
        /*
         * The equals() method compares two strings, and returns true if the strings are equal, and false if not.
         */
        if (str4.equals(inputString))
            System.out.println("yes ---> 2");
        else
            System.out.println("No ---> 2");

        System.out.println("----------------------------");
    }

    public static void myPrintString(String... str) {
        /*
         * This method can take a different number of inputs and turn it into an array to use
         */
        for (String s : str) {
            System.out.println(s);
            System.out.println("--------");
        }
    }

    public static void myPrintAString(String[]... str) {
        for (String[] aS : str) {
            for (String s : aS)
                System.out.println(s);
            System.out.println("---------");
        }
    }
}

