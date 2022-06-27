package record_examples;

import java.util.Objects;

public class RectangleClass implements Shape {

    private final double length;
    private final double width;

    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double length() {
        return length;
    }

    public double width() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleClass that = (RectangleClass) o;
        return Double.compare(that.length, length) == 0
               && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return String.format("RectangleClass[length=%f, width=%f]", length, width);
    }

    @Override
    public double getParameter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
