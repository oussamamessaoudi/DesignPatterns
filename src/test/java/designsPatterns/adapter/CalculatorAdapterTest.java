package designsPatterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAdapterTest {

    @Test
    void getArea() {
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(new Triangle(20, 10));

        System.out.println("Get Area : " + calculatorAdapter.getArea());
    }
}
