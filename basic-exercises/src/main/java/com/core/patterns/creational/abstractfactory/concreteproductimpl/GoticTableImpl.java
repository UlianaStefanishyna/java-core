package com.core.patterns.creational.abstractfactory.concreteproductimpl;

import com.core.patterns.creational.abstractfactory.abstractproduct.Table;

public class GoticTableImpl implements Table {

    @Override
    public Table createTable() {
        System.out.println("gotic table");
        return new GoticTableImpl();
    }
}
