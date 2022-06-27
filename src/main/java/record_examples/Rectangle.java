package record_examples;

public record Rectangle(double length, double width) implements Shape {
    @Override
    public double getParameter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}