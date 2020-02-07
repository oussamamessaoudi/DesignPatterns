package designsPatterns.observer;

public class Observer implements IObserver {

    private String name;


    public Observer(String name) {
        this.name = name;
    }

    public void update(int flag) {
        System.out.println(String.format("Update %s (%d)", name, flag));
    }
}
