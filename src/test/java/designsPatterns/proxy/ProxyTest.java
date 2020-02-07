package designsPatterns.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    void doSomeWork() {
        Proxy proxy = new Proxy();

        proxy.doSomeWork();
    }
}
