package com.core.patterns.abstractfactory;

import com.core.patterns.abstractfactory.abstractproduct.Chair;
import com.core.patterns.abstractfactory.abstractproduct.Sofa;
import com.core.patterns.abstractfactory.abstractproduct.Table;

public interface AbstractInterface {

    Chair createChair();

    Sofa createSofa();

    Table createTable();
}