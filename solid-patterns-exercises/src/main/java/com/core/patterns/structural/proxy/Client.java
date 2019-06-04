package com.core.patterns.structural.proxy;

import com.core.patterns.structural.proxy.impl.ProxyServiceInterfaceImpl;

public class Client {
    public static void main(String[] args) {
        ProxyServiceInterfaceImpl proxy = new ProxyServiceInterfaceImpl();
        proxy.operation();
    }
}
