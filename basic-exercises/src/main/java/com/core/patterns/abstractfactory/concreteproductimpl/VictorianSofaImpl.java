package com.core.patterns.abstractfactory.concreteproductimpl;

import com.core.patterns.abstractfactory.abstractproduct.Sofa;

public class VictorianSofaImpl implements Sofa {

    @Override
    public Sofa createSofa() {
        System.out.println("victorian sofa");
        return new VictorianSofaImpl();
    }
}
