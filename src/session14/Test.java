package session14;


import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str = "ali";
        String str2 = new String("ali");


        Scanner input = new Scanner(System.in);
        System.out.println("enter number1:");
        int number1 = input.nextInt();
        System.out.println("enter number2:");
        int number2 = input.nextInt();

        try{
            System.out.println("division of numbers: "+ divx(number1 , number2));
        }catch(Exception e){
            System.out.println("your parameter not valid!");
            System.out.println("message :"+e.getMessage());
//            System.out.println(Arrays.toString(e.getStackTrace()));//me
            e.printStackTrace();
        }finally {
            System.out.println("finally : "+"end of try catch.");
        }
        System.out.println("sum of numbers: "+ sumN(number1 , number2));



        try{
            String[][] array = {{"1","2","3"},{"4","5","6"}};
            System.out.println(array[0][20]);
            try{
                methodX(array);
            }catch (Exception exception){
                System.out.println(exception.getMessage());

            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("index of array not valid");
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            System.out.println("......");
        }catch (Exception exp){
            System.out.println(".............");
        }






    }

    private static void methodX(String[][] array) {
        //.........
    }

    private static int sumN(int number1, int number2) {
        return number1+number2;
    }

    private static int div(int number1, int number2) {
        return number1/number2;
    }

    private static int divx(int number1, int number2) throws Exception {
        if(number2 == 0){
            throw new Exception("bad parameter!!!");
        }
        return number1/number2;
    }
}
