package designsPatterns.singleton;

public class SingletonNestedClass {

    public SingletonNestedClass() {
    }

    private static class SingletonHelper{
        //Nested class is referenced after getCaptain() is called
        private static final SingletonNestedClass singleton = new SingletonNestedClass();
        static {
            System.out.println("Nested class is referenced after getCaptain() is called");
        }
    }

    public static SingletonNestedClass getInstance() {
        System.out.println("getInstance() is called");
        return SingletonHelper.singleton;
    }
}
