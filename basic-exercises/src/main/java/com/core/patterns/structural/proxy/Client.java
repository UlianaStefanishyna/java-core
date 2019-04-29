package com.core.patterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        ProxyServiceInterfaceImpl proxy = new ProxyServiceInterfaceImpl();
        proxy.operation();
    }
}
