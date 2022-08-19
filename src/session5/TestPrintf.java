package session5;

public class TestPrintf {
    public static void main(String[] args) {

        // Name Family  stdNo average ....
        String str = "java";
        //System.out.printf("welcome to %s\n",str);
        //%20s    %10d     %15f    %c char
        System.out.printf("%-20s %-20s %-10d %-15.2f\n", "Reza", "Rezaee", 123, 19.7);
        System.out.printf("%-20s %-20s %-10d %-15.2f\n", "Ali Reza", "Rezaee", 234567891, 19.7321);


    }

}
