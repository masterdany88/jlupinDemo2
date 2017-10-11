package com.example.exchange.business.logic.layer;

import com.example.exchange.base.BaseTest;
import com.jlupin.impl.client.proxy.remote.producer.ext.JLupinRemoteProxyObjectSupportsExceptionProducerImpl;
import com.jlupin.interfaces.client.proxy.producer.JLupinProxyObjectProducer;

public class CurrencyConverterTest extends BaseTest {
    private JLupinProxyObjectProducer getJLupinProxyObjectProducer() {
        return new JLupinRemoteProxyObjectSupportsExceptionProducerImpl(
                "currency-converter", getJLupinDelegator(), getJLupinLogger()
        );
    }

    // Example test
    // @Test
    // public void exampleTest() {
    //     ExampleService service = getJLupinProxyObjectProducer().produceObject(ExampleService.class);
    //     assertEquals("2 + 2 must be 4", new Integer(4), service.add(2, 2));
    // }
}