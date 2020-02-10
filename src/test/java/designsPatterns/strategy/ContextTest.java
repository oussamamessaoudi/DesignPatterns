package designsPatterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    @Test
    void setChoice() {
        Context context = new Context();

        context.setChoice(new FirstChoice());
        context.showChoice("1", "2");
        context.setChoice(new SecondChoice());
        context.showChoice("1", "2");
    }
}
