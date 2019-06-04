package com.core.patterns.structural.proxy.impl;

import com.core.patterns.structural.proxy.ServiceInterface;

public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("real method invoked after");
    }
}
