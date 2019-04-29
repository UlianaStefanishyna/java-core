package com.core.patterns.abstractfactory.concreteproductimpl;

import com.core.patterns.abstractfactory.abstractproduct.Chair;

public class GoticChairImpl implements Chair {
    @Override
    public Chair createChair() {
        System.out.println("gotic chair");
        return new GoticChairImpl();
    }
}
