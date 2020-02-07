package designsPatterns.decorator;

public class ConcreteDecoratorEx2  extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("ConcreteDecoratorEx2");
    }
}
