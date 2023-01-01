package session26.javaclass;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {

        return Math.PI * (r ^ 2);

    }

    @Override
    public double calculateprimiter() {
        return 2 * Math.PI * r;
    }

    public void circleMethod() {
        System.out.println("CircleMethod is running ... ");
    }
}
