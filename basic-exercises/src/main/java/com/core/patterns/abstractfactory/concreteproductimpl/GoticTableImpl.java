package com.core.patterns.abstractfactory.concreteproductimpl;

import com.core.patterns.abstractfactory.abstractproduct.Table;

public class GoticTableImpl implements Table {

    @Override
    public Table createTable() {
        System.out.println("gotic table");
        return new GoticTableImpl();
    }
}
