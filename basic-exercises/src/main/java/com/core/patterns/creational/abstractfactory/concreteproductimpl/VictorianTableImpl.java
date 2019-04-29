package com.core.patterns.creational.abstractfactory.concreteproductimpl;

import com.core.patterns.creational.abstractfactory.abstractproduct.Table;

public class VictorianTableImpl implements Table {
    @Override
    public Table createTable() {
        System.out.println("victorian table");
        return new VictorianTableImpl();
    }
}