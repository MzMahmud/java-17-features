package record_examples;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RectangleTest {

    @Test
    void classVsRecord() {
        RectangleClass rectangleClass = new RectangleClass(10, 5);
        assertEquals(10, rectangleClass.length());
        assertEquals(5, rectangleClass.width());
        assertEquals(new RectangleClass(10, 5), rectangleClass);

        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(10, rectangle.length());
        assertEquals(5, rectangle.width());
        assertEquals(new Rectangle(10, 5), rectangle);
        // same functionality with way less boilerplate code
    }

    @Test
    void showAreaAndParameter() {
        List<Shape> shapes = List.of(new Rectangle(10, 5), new Circle(5));
        shapes.forEach(shape -> {
            System.out.println(shape);
            System.out.printf("parameter=%f\n", shape.getParameter());
            System.out.printf("area=%f\n", shape.getArea());
        });
    }
}