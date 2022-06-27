package switch_examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

class SwitchExpressionTest {

    SwitchExpression switchExpression;

    @BeforeEach
    void beforeEach() {
        switchExpression = new SwitchExpression();
    }

    @Test
    void showAllMethods() {
        List<Consumer<SwitchExpression.Fruit>> testFunctions = List.of(
                switchExpression::oldStyleWithoutBreak,
                switchExpression::oldStyleWithBreak,
                switchExpression::withSwitchExpression,
                switchExpression::switchExpressionWithReturnValue
        );
        testFunctions.forEach(testFunction -> {
            testFunction.accept(null);
            testFunction.accept(SwitchExpression.Fruit.APPLE);
            testFunction.accept(SwitchExpression.Fruit.PEAR);
            testFunction.accept(SwitchExpression.Fruit.ORANGE);
            testFunction.accept(SwitchExpression.Fruit.AVOCADO);
        });
    }
}