package com.core.patterns.abstractfactory.concretefactory;

import com.core.patterns.abstractfactory.AbstractInterface;
import com.core.patterns.abstractfactory.abstractproduct.Chair;
import com.core.patterns.abstractfactory.abstractproduct.Sofa;
import com.core.patterns.abstractfactory.abstractproduct.Table;
import com.core.patterns.abstractfactory.concreteproductimpl.GoticChairImpl;
import com.core.patterns.abstractfactory.concreteproductimpl.GoticSofaImpl;
import com.core.patterns.abstractfactory.concreteproductimpl.GoticTableImpl;

public class GoticFactory implements AbstractInterface {

    @Override
    public Chair createChair() {
        return new GoticChairImpl().createChair();
    }

    @Override
    public Sofa createSofa() {
        return new GoticSofaImpl().createSofa();
    }

    @Override
    public Table createTable() {
        return new GoticTableImpl().createTable();
    }
}
