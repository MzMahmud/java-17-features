package switch_examples;

import record_examples.Circle;
import record_examples.Rectangle;
import record_examples.Shape;

@SuppressWarnings({"ALL"})
public class PatternMatchingForSwitch {

    // examples can be cleaned. see record_examples.Main.showAreaAndParameter method
    private static double getPerimeterWithoutInstanceofPattern(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.length() + 2 * rectangle.width();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * circle.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    // Instanceof Pattern since Java 14
    private static double getPerimeterWithInstanceofPattern(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle rectangle) {
            return 2 * rectangle.length() + 2 * rectangle.width();
        } else if (shape instanceof Circle circle) {
            return 2 * circle.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    private static double getPerimeterSwitchExpression(Shape shape) throws IllegalArgumentException {
        return switch (shape) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c -> 2 * c.radius() * Math.PI;
            case null, default -> throw new IllegalArgumentException("Unrecognized shape");
        };
    }
}
