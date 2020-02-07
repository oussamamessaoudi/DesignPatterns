package designsPatterns.observer;

public interface ISubject {
    void register(IObserver observer);
    void unregister(IObserver observer);
    void setFlag(int flag);
    void notifyObservers(int flag);
}
