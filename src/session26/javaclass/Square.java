package session26.javaclass;

public class Square implements Shape{
    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return edge*edge;
    }

    @Override
    public double calculateprimiter() {
        return edge*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
