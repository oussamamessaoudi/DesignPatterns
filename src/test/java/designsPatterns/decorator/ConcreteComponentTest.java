package designsPatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteComponentTest {

    @Test
    void doJob() {
        Component component = new ConcreteComponent();

        AbstractDecorator concreteDecoratorEx1 = new ConcreteDecoratorEx1();
        concreteDecoratorEx1.setComponent(component);
        concreteDecoratorEx1.doJob();

        AbstractDecorator concreteDecoratorEx2 = new ConcreteDecoratorEx2();
        concreteDecoratorEx2.setComponent(component);
        concreteDecoratorEx2.doJob();
    }

}
