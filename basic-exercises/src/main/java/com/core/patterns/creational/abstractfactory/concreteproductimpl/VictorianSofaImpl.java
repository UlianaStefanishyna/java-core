package com.core.patterns.creational.abstractfactory.concreteproductimpl;

import com.core.patterns.creational.abstractfactory.abstractproduct.Sofa;

public class VictorianSofaImpl implements Sofa {

    @Override
    public Sofa createSofa() {
        System.out.println("victorian sofa");
        return new VictorianSofaImpl();
    }
}
