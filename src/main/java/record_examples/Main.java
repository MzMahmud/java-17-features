package record_examples;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        showAreaAndParameter();
        classVsRecord();
    }

    private static void classVsRecord() {
        System.out.println("RectangleClass");
        RectangleClass rectangleClass = new RectangleClass(10, 5);
        System.out.printf("rectangleClass.length()=%f\n", rectangleClass.length());
        System.out.printf("rectangleClass.width()=%f\n", rectangleClass.width());
        System.out.printf("rectangleClass.equals(new RectangleClass(10, 5))=%b\n", rectangleClass.equals(new RectangleClass(10, 5)));

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.printf("rectangle.length()=%f\n", rectangle.length());
        System.out.printf("rectangle.width()=%f\n", rectangle.width());
        System.out.printf("rectangle.equals(new Rectangle(10, 5))=%b\n", rectangle.equals(new Rectangle(10, 5)));
        // same functionality with way less boilerplate code
    }

    private static void showAreaAndParameter() {
        List<Shape> shapes = List.of(new Rectangle(10, 5), new Circle(5));
        shapes.forEach(shape -> {
            System.out.println(shape);
            System.out.printf("parameter=%f\n", shape.getParameter());
            System.out.printf("area=%f\n", shape.getArea());
        });
    }
}
