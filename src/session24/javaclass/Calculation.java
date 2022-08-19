package session24.javaclass;

public class Calculation {
    protected int number1;
    protected int number2;
    private int number3;

    public Calculation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addition(){
        return number1+number2;
    }

    public int subtraction(){
        return number1-number2;
    }
}
