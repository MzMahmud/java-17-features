package switch_examples;

@SuppressWarnings({"ALL"})
public class SwitchExpression {

    public void oldStyleWithoutBreak(Fruit fruit) {
        System.out.printf("-> oldStyleWithoutBreak(%s)\n", fruit);
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
            case null: // valid in JEP 406: Pattern Matching for switch (Preview)
                System.out.println("null");
            default:
                System.out.println("Undefined fruit");
        }
    }

    public void oldStyleWithBreak(Fruit fruit) {
        System.out.printf("-> oldStyleWithBreak(%s)\n", fruit);
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
                break;
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
                break;
            case null:
                System.out.println("null");
                break;
            default:
                System.out.println("Undefined fruit");
        }
    }

    public void withSwitchExpression(Fruit fruit) {
        System.out.printf("-> withSwitchExpression(%s)\n", fruit);
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
            case null -> System.out.println("null");
            default -> System.out.println("Undefined fruit");
        }
    }

    public void switchExpressionWithReturnValue(Fruit fruit) {
        System.out.printf("-> switchExpressionWithReturnValue(%s)\n", fruit);
        String text = switch (fruit) {
            case APPLE, PEAR -> "Common fruit";
            case ORANGE, AVOCADO -> "Exotic fruit";
            case null -> "null";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    public enum Fruit {
        APPLE,
        PEAR,
        ORANGE,
        AVOCADO
    }
}
