package com.core.patterns.abstractfactory.concreteproductimpl;

import com.core.patterns.abstractfactory.abstractproduct.Sofa;

public class GoticSofaImpl implements Sofa {

    @Override
    public Sofa createSofa() {
        System.out.println("gotic sofa");
        return new GoticSofaImpl();
    }
}
