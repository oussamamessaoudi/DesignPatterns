package designsPatterns.observer;

import org.junit.jupiter.api.Test;


class SubjectTest {

    @Test
    void updateObservers() {
        System.out.println("*** Start Observer Pattern ***");
        IObserver observer1 = new Observer("observer1");
        IObserver observer2 = new Observer("observer2");

        ISubject subject = new Subject();

        subject.register(observer1);
        subject.register(observer2);


        subject.setFlag(10);
        subject.setFlag(20);

        System.out.println("*** END Observer Pattern ***");



    }
}
