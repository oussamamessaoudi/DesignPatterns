package designsPatterns.decorator;

public class ConcreteDecoratorEx1  extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("ConcreteDecoratorEx1");
    }
}
