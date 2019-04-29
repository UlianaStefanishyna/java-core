package com.core.patterns.abstractfactory.concretefactory;

import com.core.patterns.abstractfactory.AbstractInterface;
import com.core.patterns.abstractfactory.abstractproduct.Chair;
import com.core.patterns.abstractfactory.abstractproduct.Sofa;
import com.core.patterns.abstractfactory.abstractproduct.Table;
import com.core.patterns.abstractfactory.concreteproductimpl.VictorianChairImpl;
import com.core.patterns.abstractfactory.concreteproductimpl.VictorianSofaImpl;
import com.core.patterns.abstractfactory.concreteproductimpl.VictorianTableImpl;

public class VictorianFactory implements AbstractInterface {

    @Override
    public Chair createChair() {
        return new VictorianChairImpl().createChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofaImpl().createSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTableImpl().createTable();
    }
}
