package session11;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        printArray(array);
        System.out.println("After Modify");
        modifyArray(array, 2);
        printArray(array);
        System.out.println("After Modify element");
        modifyElement(array[0], 2);//modifyElement(20, 2);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int val:array)
            System.out.println(val);
    }

    public static void modifyArray(int[] array, int val) {
        for (int i = 0; i < array.length; i++)
            array[i] *= val;
    }
    public static void modifyElement(int element, int val){
        element*=val;
        System.out.println("Element="+element);
    }

}
