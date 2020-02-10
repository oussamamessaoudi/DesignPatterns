package designsPatterns.strategy;

public class SecondChoice implements IChoice {
    @Override
    public void myChoice(String a, String b) {
        System.out.println(a+b);
    }
}
