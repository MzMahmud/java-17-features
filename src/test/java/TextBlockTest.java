import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextBlockTest {

    TextBlock textBlock;

    @BeforeEach
    void init() {
        textBlock = new TextBlock();
    }

    @Test
    void showText() {
        System.out.println(textBlock.getJsonStringOldStyle());
        System.out.println(textBlock.getJsonStringTextBlock());
    }
}