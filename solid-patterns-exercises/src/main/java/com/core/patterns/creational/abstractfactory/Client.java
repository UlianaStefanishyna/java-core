package com.core.patterns.creational.abstractfactory;

import com.core.patterns.creational.abstractfactory.concretefactory.GoticFactory;
import com.core.patterns.creational.abstractfactory.concretefactory.VictorianFactory;

public class Client {

    public static void main(String[] args) {

        AbstractInterface victorianProducts = new VictorianFactory();

        victorianProducts.createChair();
        victorianProducts.createSofa();
        victorianProducts.createTable();

        AbstractInterface goticProducts = new GoticFactory();
        goticProducts.createSofa();
        goticProducts.createChair();
        goticProducts.createTable();
    }
}
