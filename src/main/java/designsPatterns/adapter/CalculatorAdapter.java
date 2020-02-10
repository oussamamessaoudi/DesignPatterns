package designsPatterns.adapter;

public class CalculatorAdapter {
    private Calculator calculator;
    private Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    public double getArea(){
        calculator = new Calculator(new Rect(triangle.getL(), triangle.getW()*0.5));
        return calculator.getArea();
    }
}
