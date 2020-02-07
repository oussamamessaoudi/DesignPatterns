package designsPatterns.proxy;

public class Proxy extends Subject {
    private Subject sc;


    @Override
    public void doSomeWork() {
        if(sc == null)
            sc = new ConcreteSubject();

        sc.doSomeWork();;
    }
}
