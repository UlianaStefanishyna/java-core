package com.core.patterns.structural.proxy.impl;

import com.core.patterns.structural.proxy.ServiceInterface;

public class ProxyServiceInterfaceImpl implements ServiceInterface {

    private final ServiceInterfaceImpl serviceInterface;

    public ProxyServiceInterfaceImpl() {
        this.serviceInterface = new ServiceInterfaceImpl();
    }

    @Override
    public void operation() {
        System.out.println("proxy method invoked first");
        if (checkAccess()) {
            this.serviceInterface.operation();
        }
    }

    private boolean checkAccess() {
        return true;
    }
}
