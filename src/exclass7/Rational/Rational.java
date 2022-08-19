package exclass7.Rational;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0)
            throw new ArithmeticException();

        simplification(numerator, denominator);
    }

    private void simplification(int numerator, int denominator) {
        int sign;

        if (numerator < 0 && denominator < 0)
            sign = 1;
        else if (numerator < 0 || denominator < 0)
            sign = -1;
        else
            sign = 1;

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        int bmm = 1;

        for (int i = numerator; i > 0; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                bmm = i;
                break;
            }
        }

        this.numerator = sign * numerator / bmm;
        this.denominator = denominator / bmm;
    }

    public Rational add(Rational num) {
        return new Rational(numerator * num.getDenominator() + denominator * num.getNumerator(), denominator * num.getDenominator());
    }

    public Rational sub(Rational num) {
        return new Rational(numerator * num.getDenominator() - denominator * num.getNumerator(), denominator * num.getDenominator());
    }

    public Rational mul(Rational num) {
        return new Rational(numerator * num.getNumerator(), denominator * num.getDenominator());
    }

    public Rational div(Rational num) {
        return mul(num.reverse());
    }

    public Rational reverse() {
        return new Rational(denominator, numerator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
