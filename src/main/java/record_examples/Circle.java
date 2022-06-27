package record_examples;

public record Circle(double radius) implements Shape {
    @Override
    public double getParameter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}