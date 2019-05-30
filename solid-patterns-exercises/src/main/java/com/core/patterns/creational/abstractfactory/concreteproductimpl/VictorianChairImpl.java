package com.core.patterns.creational.abstractfactory.concreteproductimpl;

import com.core.patterns.creational.abstractfactory.abstractproduct.Chair;

public class VictorianChairImpl implements Chair {

    @Override
    public Chair createChair() {
        System.out.println("victorian chair");
        return new VictorianChairImpl();
    }
}
