package com.core.patterns.structural.proxy;

public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("real operation logic");
    }
}
