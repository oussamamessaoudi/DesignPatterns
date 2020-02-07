package designsPatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject implements ISubject {

    Set<IObserver> observers;
    private int flag;


    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        if(flag >= 5 && flag <= 25) this.notifyObservers(flag);
    }

    public Subject() {
        observers = new HashSet<>();
    }

    @Override
    public void register(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void unregister(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int flag) {
        observers.forEach(observer -> observer.update(flag));
    }
}
