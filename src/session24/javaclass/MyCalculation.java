package session24.javaclass;

public class MyCalculation extends Calculation{
    private int factor;


    public MyCalculation(int number1, int number2 , int factor) {
        super(number1, number2);
        this.factor = factor ;
    }


    public void multiplication(){
        System.out.println("factor*(num1+num2) : "+factor*super.addition());
        System.out.println("factor*(num1-num2) : "+factor*super.subtraction());
//        System.out.println(factor*(number1+number2));
    }




}
