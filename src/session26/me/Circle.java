package session26.me;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double CalculateArea() {

        return Math.PI * (r ^ 2);

    }

    @Override
    public double CalculatorPerimeter() {
        return 2 * Math.PI * r;
    }

    public void circleMethod() {
        System.out.println("CircleMethod is running ... ");
    }
}
