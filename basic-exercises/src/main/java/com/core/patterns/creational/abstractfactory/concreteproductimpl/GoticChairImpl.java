package com.core.patterns.creational.abstractfactory.concreteproductimpl;

import com.core.patterns.creational.abstractfactory.abstractproduct.Chair;

public class GoticChairImpl implements Chair {
    @Override
    public Chair createChair() {
        System.out.println("gotic chair");
        return new GoticChairImpl();
    }
}
