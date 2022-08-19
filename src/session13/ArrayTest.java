package session13;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String args[]) {

//        int a[]=new int[10];
//        int b[]=new int[20];
//        a=b;    //1
//        b=a;    //2 
        //int array[][] = new int[2][3];

       int  array[][]={{1,2,3},{4,5,6}};

        //System.out.println(array[1][2]);

        int b[][] = {{3, 4}, {5, 6}};

        int c[][] = {{3, 4}, {5, 6, 7}}; //c[1][2]=?
      //  printArray(array);
        int d[][] = new int[2][];
        d[0] = new int[10];
        d[1] = new int[20];
printArray(d);
    }

    public static void printArray(int array[][]) {
int i=0;
        for (int [] ar :array) {
//            for ( int val:ar) {
//                System.out.print(val+" ");
//            }

            System.out.println(ar[i]);
i++;
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//
//                System.out.print(array[i][j]+" ");
//
//            }
//            System.out.println("");
//        }

    }
    public static void printArray(int array[]) {

        for (int val:array) {
            System.out.println(val);

        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

    }

    public static void modifyArray(int array[], int val) {

        for (int i = 0; i < array.length; i++) {
            array[i] *= val;
        }

    }

    public static void modifyElement(int element, int val) {
        element *= val;
        System.out.println("Element=" + element);

    }

}
