package com.core.patterns.abstractfactory.concreteproductimpl;

import com.core.patterns.abstractfactory.abstractproduct.Chair;

public class VictorianChairImpl implements Chair {

    @Override
    public Chair createChair() {
        System.out.println("victorian chair");
        return new VictorianChairImpl();
    }
}
