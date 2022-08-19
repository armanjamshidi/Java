package javafinal;

public class Factor extends Base {
    private double fact;


    public double avgValue() {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += getNumbers().get(i) * fact;
        }
        return sum / getNumbers().size();
    }
}
