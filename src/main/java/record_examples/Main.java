package record_examples;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Rectangle(10, 5), new Circle(5));
        shapes.forEach(shape -> {
            System.out.println(shape);
            System.out.printf("parameter=%f\n", shape.getParameter());
            System.out.printf("area=%f\n", shape.getArea());
        });
    }
}
