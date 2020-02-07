package designsPatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getSingleton() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
        System.out.println(singleton.toString());
        assertSame(Singleton.getInstance(), Singleton.getInstance());
    }

    @Test
    void getSingletonNestedClass() {
        SingletonNestedClass singleton = SingletonNestedClass.getInstance();
        System.out.println(singleton.toString());
        System.out.println(singleton.toString());
        assertSame(Singleton.getInstance(), Singleton.getInstance());
    }
}
