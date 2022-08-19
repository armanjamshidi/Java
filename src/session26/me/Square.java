package session26.me;

public class Square implements Shape{
    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    @Override
    public double CalculateArea() {
        return edge*edge;
    }

    @Override
    public double CalculatorPerimeter() {
        return 4*edge;
    }
}
