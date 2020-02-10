package designsPatterns.strategy;

public class FirstChoice implements IChoice {
    @Override
    public void myChoice(String a, String b) {
        int i1 = Integer.parseInt(a);
        int i2 = Integer.parseInt(b);

        System.out.println(i1+i2);
    }
}
