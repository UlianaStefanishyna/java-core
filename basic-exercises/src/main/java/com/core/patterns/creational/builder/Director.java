package com.core.patterns.creational.builder;

public class Director {

    public void constructSpecific(Builder builder) {
        builder.setDoorsCount(4);
        builder.setRoofType("specific type");
    }
}