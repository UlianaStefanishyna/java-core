package com.core.patterns.abstractfactory.concreteproductimpl;

import com.core.patterns.abstractfactory.abstractproduct.Table;

public class VictorianTableImpl implements Table {
    @Override
    public Table createTable() {
        System.out.println("victorian table");
        return new VictorianTableImpl();
    }
}