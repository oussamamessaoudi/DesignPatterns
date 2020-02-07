package designsPatterns.proxy;

public class ConcreteSubject extends Subject{

    @Override
    public void doSomeWork() {
        System.out.println("Do Some Work");
    }
}
