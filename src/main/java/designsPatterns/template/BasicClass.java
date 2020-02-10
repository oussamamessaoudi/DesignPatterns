package designsPatterns.template;

public abstract class BasicClass {
    public void papers(){
        basic1();
        basic2();
        specialPapers();
    }
    private void basic1(){
        System.out.println("Basic(1)");
    }
    private void basic2(){
        System.out.println("Basic(2)");
    }
    public abstract void specialPapers();
}

