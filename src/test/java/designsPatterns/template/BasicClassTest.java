package designsPatterns.template;

import org.junit.jupiter.api.Test;

class BasicClassTest {

    @Test
    void specialPapers() {
        BasicClass basicClass1 = new SpecificClass1();
        BasicClass basicClass2 = new SpecificClass2();


        basicClass1.papers();
        System.out.println("###########################");
        basicClass2.papers();
    }
}
