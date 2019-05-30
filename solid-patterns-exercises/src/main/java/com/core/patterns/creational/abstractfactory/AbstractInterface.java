package com.core.patterns.creational.abstractfactory;

import com.core.patterns.creational.abstractfactory.abstractproduct.Chair;
import com.core.patterns.creational.abstractfactory.abstractproduct.Sofa;
import com.core.patterns.creational.abstractfactory.abstractproduct.Table;

public interface AbstractInterface {

    Chair createChair();

    Sofa createSofa();

    Table createTable();
}