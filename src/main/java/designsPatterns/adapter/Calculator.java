package designsPatterns.adapter;

public class Calculator {
    private Rect rect;

    public Calculator(Rect rect) {
        this.rect = rect;
    }

    public double getArea(){
        return rect.getW() * rect.getL();
    }
}
